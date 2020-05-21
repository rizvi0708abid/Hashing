class Solution {
    
     public static String sortString(String inputString) 
    { 
        char tempArray[] = inputString.toCharArray(); 
        Arrays.sort(tempArray); 
        return new String(tempArray); 
    } 
    
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> output = new ArrayList<>();
        
        Map<String,List<String>> map = new HashMap<>();
        
        for(String s : strs){
            String keyStr = sortString(s);
            if(map.containsKey(keyStr)){
                List<String> strList = map.get(keyStr);
                strList.add(s);
                map.put(keyStr,strList);
            }else{
                List<String> strList = new ArrayList();
                strList.add(s);
                map.put(keyStr,strList);
            }
        }
        
        map.forEach((k,v) -> output.add(v));
        return output;
    }
}
