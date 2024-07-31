.class public final Lv5/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/a$d;


# static fields
.field public static final i:Lv5/c;


# instance fields
.field public final h:Landroid/os/Bundle;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    new-instance v1, Lv5/c;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lv5/c;-><init>(Landroid/os/Bundle;Lv5/i;)V

    sput-object v1, Lv5/c;->i:Lv5/c;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Bundle;Lv5/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv5/c;->h:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 2

    new-instance v0, Landroid/os/Bundle;

    iget-object v1, p0, Lv5/c;->h:Landroid/os/Bundle;

    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lv5/c;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lv5/c;

    iget-object v0, p0, Lv5/c;->h:Landroid/os/Bundle;

    iget-object p1, p1, Lv5/c;->h:Landroid/os/Bundle;

    invoke-static {v0, p1}, Lh6/q;->a(Landroid/os/Bundle;Landroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lv5/c;->h:Landroid/os/Bundle;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
