.class public final Lce/k2;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lhe/l0;

.field public static final b:Lhe/l0;

.field public static final c:Lhe/l0;

.field public static final d:Lhe/l0;

.field public static final e:Lhe/l0;

.field public static final f:Lce/l1;

.field public static final g:Lce/l1;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhe/l0;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lce/k2;->a:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lce/k2;->b:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lce/k2;->c:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lce/k2;->d:Lhe/l0;

    new-instance v0, Lhe/l0;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lhe/l0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lce/k2;->e:Lhe/l0;

    new-instance v0, Lce/l1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lce/l1;-><init>(Z)V

    sput-object v0, Lce/k2;->f:Lce/l1;

    new-instance v0, Lce/l1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lce/l1;-><init>(Z)V

    sput-object v0, Lce/k2;->g:Lce/l1;

    return-void
.end method

.method public static final synthetic a()Lhe/l0;
    .locals 1

    sget-object v0, Lce/k2;->a:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic b()Lhe/l0;
    .locals 1

    sget-object v0, Lce/k2;->c:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic c()Lce/l1;
    .locals 1

    sget-object v0, Lce/k2;->g:Lce/l1;

    return-object v0
.end method

.method public static final synthetic d()Lce/l1;
    .locals 1

    sget-object v0, Lce/k2;->f:Lce/l1;

    return-object v0
.end method

.method public static final synthetic e()Lhe/l0;
    .locals 1

    sget-object v0, Lce/k2;->e:Lhe/l0;

    return-object v0
.end method

.method public static final synthetic f()Lhe/l0;
    .locals 1

    sget-object v0, Lce/k2;->d:Lhe/l0;

    return-object v0
.end method

.method public static final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lce/x1;

    if-eqz v0, :cond_0

    new-instance v0, Lce/y1;

    check-cast p0, Lce/x1;

    invoke-direct {v0, p0}, Lce/y1;-><init>(Lce/x1;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method

.method public static final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lce/y1;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lce/y1;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_2

    iget-object v0, v0, Lce/y1;->a:Lce/x1;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    move-object p0, v0

    :cond_2
    :goto_1
    return-object p0
.end method
