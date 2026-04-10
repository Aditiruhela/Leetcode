class StockSpanner {
    ArrayList<Integer>list;
    public StockSpanner() {
       list=new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        int span=1;
        for(int i=list.size()-2;i>=0;i--){
            if(list.get(i)<=price) span++;
            else break;
        }
        return span;
    }
}