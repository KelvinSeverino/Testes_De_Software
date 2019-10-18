public class Usuario
{
    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o instanceof Usuario)
        {
            Usuario u = (Usuario) o;
            if(this.id.equals(u.getId()) && this.username.equals(u.getUsername()))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
        
    }
}