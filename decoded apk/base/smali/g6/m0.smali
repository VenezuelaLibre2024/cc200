.class public final Lg6/m0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lg6/b;

.field public final b:Le6/d;


# direct methods
.method public synthetic constructor <init>(Lg6/b;Le6/d;Lg6/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/m0;->a:Lg6/b;

    iput-object p2, p0, Lg6/m0;->b:Le6/d;

    return-void
.end method

.method public static bridge synthetic a(Lg6/m0;)Le6/d;
    .locals 0

    iget-object p0, p0, Lg6/m0;->b:Le6/d;

    return-object p0
.end method

.method public static bridge synthetic b(Lg6/m0;)Lg6/b;
    .locals 0

    iget-object p0, p0, Lg6/m0;->a:Lg6/b;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lg6/m0;

    if-eqz v1, :cond_0

    check-cast p1, Lg6/m0;

    iget-object v1, p0, Lg6/m0;->a:Lg6/b;

    iget-object v2, p1, Lg6/m0;->a:Lg6/b;

    invoke-static {v1, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lg6/m0;->b:Le6/d;

    iget-object p1, p1, Lg6/m0;->b:Le6/d;

    invoke-static {v1, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lg6/m0;->a:Lg6/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lg6/m0;->b:Le6/d;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lh6/q;->d(Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lg6/m0;->a:Lg6/b;

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lg6/m0;->b:Le6/d;

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    invoke-virtual {v0}, Lh6/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
