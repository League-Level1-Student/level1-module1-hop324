package Bond_JamesBond;

public class JamesBond {
JamesBond(){
	
}

int findCode(Vault A) {
	for(int i = 1000000; 1 > 0; i--) {
		if(A.tryCode(i)) {
			return i;}
		}
	}
}

