.class public abstract Lza/j;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Loa/a;

.field public final b:Lza/s;


# direct methods
.method public constructor <init>(Loa/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/j;->a:Loa/a;

    new-instance v0, Lza/s;

    invoke-direct {v0, p1}, Lza/s;-><init>(Loa/a;)V

    iput-object v0, p0, Lza/j;->b:Lza/s;

    return-void
.end method

.method public static a(Loa/a;)Lza/j;
    .locals 7

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Loa/a;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v0, Lza/g;

    invoke-direct {v0, p0}, Lza/g;-><init>(Loa/a;)V

    return-object v0

    :cond_0
    const/4 v1, 0x2

    invoke-virtual {p0, v1}, Loa/a;->e(I)Z

    move-result v1

    if-nez v1, :cond_1

    new-instance v0, Lza/k;

    invoke-direct {v0, p0}, Lza/k;-><init>(Loa/a;)V

    return-object v0

    :cond_1
    const/4 v1, 0x4

    invoke-static {p0, v0, v1}, Lza/s;->g(Loa/a;II)I

    move-result v2

    if-eq v2, v1, :cond_5

    const/4 v1, 0x5

    if-eq v2, v1, :cond_4

    invoke-static {p0, v0, v1}, Lza/s;->g(Loa/a;II)I

    move-result v1

    const/16 v2, 0xc

    if-eq v1, v2, :cond_3

    const/16 v2, 0xd

    if-eq v1, v2, :cond_2

    const/4 v1, 0x7

    invoke-static {p0, v0, v1}, Lza/s;->g(Loa/a;II)I

    move-result v0

    const-string v1, "17"

    const-string v2, "15"

    const-string v3, "13"

    const-string v4, "11"

    const-string v5, "320"

    const-string v6, "310"

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "unknown decoder: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v5, v1}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_1
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v6, v1}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_2
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v5, v2}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_3
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v6, v2}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_4
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v5, v3}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_5
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v6, v3}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v5, v4}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :pswitch_7
    new-instance v0, Lza/e;

    invoke-direct {v0, p0, v6, v4}, Lza/e;-><init>(Loa/a;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_2
    new-instance v0, Lza/d;

    invoke-direct {v0, p0}, Lza/d;-><init>(Loa/a;)V

    return-object v0

    :cond_3
    new-instance v0, Lza/c;

    invoke-direct {v0, p0}, Lza/c;-><init>(Loa/a;)V

    return-object v0

    :cond_4
    new-instance v0, Lza/b;

    invoke-direct {v0, p0}, Lza/b;-><init>(Loa/a;)V

    return-object v0

    :cond_5
    new-instance v0, Lza/a;

    invoke-direct {v0, p0}, Lza/a;-><init>(Loa/a;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x38
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final b()Lza/s;
    .locals 1

    iget-object v0, p0, Lza/j;->b:Lza/s;

    return-object v0
.end method

.method public final c()Loa/a;
    .locals 1

    iget-object v0, p0, Lza/j;->a:Loa/a;

    return-object v0
.end method

.method public abstract d()Ljava/lang/String;
.end method
