grammar Sample;

options {
  language = Java;
}

@header {
	package org.alprojects.antlr_test;
}

@lexer::header {
	package org.alprojects.antlr_test; 
}

rule returns [double res]: 
	a1= sum_expr {$res = a1;};
	
atom returns[double res]: 
	( 
		INT {$res =  Integer.parseInt($INT.text); } 
		| 
		'(' a2= sum_expr {$res = a2;} ')' 
	) ;

mult_expr returns[double res]: 
	a1= neg_atom {$res=a1;}
    ( ('/' a2= neg_atom {$res /= a2;} | '*' a3= neg_atom {$res *= a3;}) )*;
	

sum_expr returns[double res]: 
	a1= mult_expr {$res=a1;}
	( ('-' a2= mult_expr {$res-=a2;} |'+' a3= mult_expr {$res+=a3;} ) )*; 

neg_atom returns [double res]:
	('-' a1= neg_atom {$res = -a1; })
	|
	('+' a2= neg_atom {$res = a2; })
	|
	(a3= atom {$res = a3; })
	;

WS : (' '|'\t'|'\f'|'\n'|'\r')+ { $channel=HIDDEN; };
INT : ('0'..'9')+;
