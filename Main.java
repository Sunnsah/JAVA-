import java.util.Vector;
class Main{
    public static void main(String[] args) {
        // use of Boolean Wrapper Class
        Boolean bobj = new Boolean(false);
        Boolean bobj2 = new  Boolean("True");
        System.out.println("value of bobj: " + bobj);
        System.out.println("value of bobj2: " + bobj2);
        System.out.println("value of bobj.TRUE: " + bobj.TRUE);
        System.out.println("value of bobj.FALSE: " + bobj.FALSE);
        System.out.println("value of bobj.TYPE: " + bobj.TYPE);
        
        
        // use of Byte Wrapper Class;
        byte bt = 12;
        Byte btobj = new Byte(bt);
        Byte btobj2 = new Byte("15");
        System.out.println("value of btobj: " + btobj);
        System.out.println("value of btobj2: " + btobj2);
        System.out.println("value of btobj.MAX_VALUE: " + btobj.MAX_VALUE);
        System.out.println("value of btobj.MIN_VALUE: " + btobj.MIN_VALUE);
        System.out.println("value of btobj.TYPE: " + btobj.TYPE);
        System.out.println("value of btobj.SIZE: " + btobj.SIZE);
        
          // use of Double Wrapper Class;
        double db = 12.20;
        Double dbo = new Double(db);
        Double dbo1 = new Double("15");
        System.out.println("value of btobj: " + dbo);
        System.out.println("value of btobj2: " + dbo1);
        System.out.println("value of btobj.MAX_VALUE: " + dbo.MAX_VALUE);
        System.out.println("value of btobj.MIN_VALUE: " + dbo.MIN_VALUE);
        System.out.println("value of btobj.TYPE: " + dbo.TYPE);
        System.out.println("value of btobj.SIZE: " + dbo.SIZE);
        
              // use of Long Wrapper Class;
        long lb = 12;
        Long lbo = new Long(lb);
        Long lbo1 = new Long("15");
        System.out.println("value of btobj: " + lbo);
        System.out.println("value of btobj2: " + lbo1);
        System.out.println("value of btobj.MAX_VALUE: " + lbo.MAX_VALUE);
        System.out.println("value of btobj.MIN_VALUE: " + lbo.MIN_VALUE);
        System.out.println("value of btobj.TYPE: " + lbo.TYPE);
        System.out.println("value of btobj.SIZE: " + lbo.SIZE);
        
        
        // use of Integer Wrapper Class;
        Integer iobj = new Integer(1);
        Integer iobj2 = new Integer("12");
        System.out.println("value of iobj: " + iobj);
        System.out.println("value of iobj2: " + iobj2);
        System.out.println("value of iobj.MAX_VALUE: " + iobj.MAX_VALUE);
        System.out.println("value of iobj.MIN_VALUE: " + iobj.MIN_VALUE);
        System.out.println("value of iobj.TYPE: " + iobj.TYPE);
        System.out.println("value of iobj.SIZE: " + iobj.SIZE);
        
        // use of Short Wrapper Class;
        Short st =12;
        Short sobj = new Short(st);
        Short sobj2 = new Short("12");
        System.out.println("value of iobj: " + sobj);
        System.out.println("value of iobj2: " + sobj2);
        System.out.println("value of iobj.MAX_VALUE: " + sobj.MAX_VALUE);
        System.out.println("value of iobj.MIN_VALUE: " + sobj.MIN_VALUE);
        System.out.println("value of iobj.TYPE: " + sobj.TYPE);
        System.out.println("value of iobj.SIZE: " + sobj.SIZE);
        
              // use of character Wrapper Class;
        char chd ='A';
        Character cbo = new Character(chd);
        Character cbo1 = new Character('r');
        System.out.println("value of btobj: " + cbo);
        System.out.println("value of btobj2: " + cbo1);
        System.out.println("value of btobj.MAX_VALUE: " + cbo.MAX_VALUE);
        System.out.println("value of btobj.MIN_VALUE: " + cbo.MIN_VALUE);
        System.out.println("value of btobj.TYPE: " + cbo.TYPE);
        System.out.println("value of btobj.SIZE: " + cbo.SIZE);
        
        
        
        
        // use of Integer Wrapphttps://www.onlinegdb.com/online_java_compiler#tab-stdiner Class;
        float f = (float)10.20;
        Float fobj = new Float(f);
        Float fobj2 = new Float("12.234");
        System.out.println("value of fobj: " + fobj);
        System.out.println("value of fobj2: " + fobj2);
        System.out.println("value of fobj.MAX_VALUE: " + fobj.MAX_VALUE);
        System.out.println("value of fobj.MIN_VALUE: " + fobj.MIN_VALUE);
        System.out.println("value of fobj.TYPE: " + fobj.TYPE);
        System.out.println("value of fobj.SIZE: " + fobj.SIZE);
        
        Vector <Double> vd = new Vector <> ();
        vd.add(12.12);
        vd.add(21.12);
        vd.add(32.43);
        vd.add(54.67);
        System.out.println("value of vd: " + vd);
        System.out.println("size of vd: " + vd.size());
        vd.remove(0);
        System.out.println("value of vd: " + vd);
        System.out.println("size of vd: " + vd.size());

        
    }
}