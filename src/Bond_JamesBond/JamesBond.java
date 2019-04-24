package Bond_JamesBond;

public class JamesBond {

JamesBond(){}
int findCode(Vault V) {
	for(int i = 1000000000; 1 > 0; i--) {
		if(V.tryCode(i)) {
			return i;}
		}
	}

}

