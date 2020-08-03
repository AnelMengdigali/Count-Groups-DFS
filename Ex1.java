class Result {
    
    static Set<Integer> result = new HashSet<>();
    
    public static boolean DFS_Visit( int location, List<String> related ){
        
        String relationships;
        boolean checker = false;
        
        if( ! result.contains( location ) ){
            
            checker = true;
            
            String person = related.get( location );
            
            relationships = person.toString();
            
            result.add( location );
            
            for( int i = 0; i < relationships.length(); i ++ ){
                
                if( relationships.charAt(i) == '1' ){
                    DFS_Visit( i, related );
                }
                
            }
            
            return checker;
            
        }
        
        return checker;
        
    }
    
    public static int countGroups( List<String> related ){
        
        boolean value;
        int numGroups = 0;
        
        for( int i = 0; i < related.size(); i ++ ){
            
            value = DFS_Visit( i, related );
            
            if( value ){
                numGroups ++;
            }
            
        }
        
        return numGroups;
        
    }
    
}