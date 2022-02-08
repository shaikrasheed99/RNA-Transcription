class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rna = "";
        int length = dnaStrand.length();
        for(int i=0;i<length;i++){
        		char dna = dnaStrand.charAt(i);
        		switch(dna){
        			case 'A':
        				rna += 'U';
        				break;
        			case 'T':
        				rna += 'A';
        				break;
        			case 'C':
        				rna += 'G';
        				break;
        			case 'G':
        				rna += 'C';
        				break;
        		}
        }
        return rna;
    }

}

