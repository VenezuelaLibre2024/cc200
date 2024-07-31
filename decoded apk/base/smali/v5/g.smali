.class public final Lv5/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf6/a$d;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final k:Lv5/g;


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Z

.field public final j:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lv5/f;

    invoke-direct {v0}, Lv5/f;-><init>()V

    new-instance v1, Lv5/g;

    invoke-direct {v1, v0}, Lv5/g;-><init>(Lv5/f;)V

    sput-object v1, Lv5/g;->k:Lv5/g;

    return-void
.end method

.method public constructor <init>(Lv5/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lv5/g;->h:Ljava/lang/String;

    iget-object v0, p1, Lv5/f;->a:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iput-boolean v0, p0, Lv5/g;->i:Z

    iget-object p1, p1, Lv5/f;->b:Ljava/lang/String;

    iput-object p1, p0, Lv5/g;->j:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic b(Lv5/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lv5/g;->h:Ljava/lang/String;

    const/4 p0, 0x0

    return-object p0
.end method

.method public static bridge synthetic c(Lv5/g;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lv5/g;->j:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic d(Lv5/g;)Z
    .locals 0

    iget-boolean p0, p0, Lv5/g;->i:Z

    return p0
.end method


# virtual methods
.method public final a()Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "consumer_package"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    iget-boolean v1, p0, Lv5/g;->i:Z

    const-string v2, "force_save_dialog"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    iget-object v1, p0, Lv5/g;->j:Ljava/lang/String;

    const-string v2, "log_session_id"

    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lv5/g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lv5/g;

    iget-object v1, p1, Lv5/g;->h:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {v1, v1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Lv5/g;->i:Z

    iget-boolean v3, p1, Lv5/g;->i:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Lv5/g;->j:Ljava/lang/String;

    iget-object p1, p1, Lv5/g;->j:Ljava/lang/String;

    invoke-static {v1, p1}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    const/4 v2, 0x0

    aput-object v2, v0, v1

    iget-boolean v1, p0, Lv5/g;->i:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lv5/g;->j:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    invoke-static {v0}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
