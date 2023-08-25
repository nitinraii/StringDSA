public class shortestPath{
    public static float shortpath(String path){
        int x =0,y=0;
        for(int i =0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'W'){
                x++;
            }
            else{
                x--;
            }
        }
        float x2 = x*x;
        float y2 =y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(shortpath(path));
    }
}