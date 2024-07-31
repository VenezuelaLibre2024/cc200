.class public final Lx5/b;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/b$a;,
        Lx5/b$e;,
        Lx5/b$b;,
        Lx5/b$d;,
        Lx5/b$c;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx5/b;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Lx5/b$e;

.field public final i:Lx5/b$b;

.field public final j:Ljava/lang/String;

.field public final k:Z

.field public final l:I

.field public final m:Lx5/b$d;

.field public final n:Lx5/b$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/o;

    invoke-direct {v0}, Lx5/o;-><init>()V

    sput-object v0, Lx5/b;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Lx5/b$e;Lx5/b$b;Ljava/lang/String;ZILx5/b$d;Lx5/b$c;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/b$e;

    iput-object p1, p0, Lx5/b;->h:Lx5/b$e;

    invoke-static {p2}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx5/b$b;

    iput-object p1, p0, Lx5/b;->i:Lx5/b$b;

    iput-object p3, p0, Lx5/b;->j:Ljava/lang/String;

    iput-boolean p4, p0, Lx5/b;->k:Z

    iput p5, p0, Lx5/b;->l:I

    const/4 p1, 0x0

    if-nez p6, :cond_0

    invoke-static {}, Lx5/b$d;->I()Lx5/b$d$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lx5/b$d$a;->b(Z)Lx5/b$d$a;

    invoke-virtual {p2}, Lx5/b$d$a;->a()Lx5/b$d;

    move-result-object p6

    :cond_0
    iput-object p6, p0, Lx5/b;->m:Lx5/b$d;

    if-nez p7, :cond_1

    invoke-static {}, Lx5/b$c;->I()Lx5/b$c$a;

    move-result-object p2

    invoke-virtual {p2, p1}, Lx5/b$c$a;->b(Z)Lx5/b$c$a;

    invoke-virtual {p2}, Lx5/b$c$a;->a()Lx5/b$c;

    move-result-object p7

    :cond_1
    iput-object p7, p0, Lx5/b;->n:Lx5/b$c;

    return-void
.end method

.method public static I()Lx5/b$a;
    .locals 1

    new-instance v0, Lx5/b$a;

    invoke-direct {v0}, Lx5/b$a;-><init>()V

    return-object v0
.end method

.method public static O(Lx5/b;)Lx5/b$a;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lx5/b;->I()Lx5/b$a;

    move-result-object v0

    invoke-virtual {p0}, Lx5/b;->J()Lx5/b$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/b$a;->c(Lx5/b$b;)Lx5/b$a;

    invoke-virtual {p0}, Lx5/b;->M()Lx5/b$e;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/b$a;->f(Lx5/b$e;)Lx5/b$a;

    invoke-virtual {p0}, Lx5/b;->L()Lx5/b$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/b$a;->e(Lx5/b$d;)Lx5/b$a;

    invoke-virtual {p0}, Lx5/b;->K()Lx5/b$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/b$a;->d(Lx5/b$c;)Lx5/b$a;

    iget-boolean v1, p0, Lx5/b;->k:Z

    invoke-virtual {v0, v1}, Lx5/b$a;->b(Z)Lx5/b$a;

    iget v1, p0, Lx5/b;->l:I

    invoke-virtual {v0, v1}, Lx5/b$a;->h(I)Lx5/b$a;

    iget-object p0, p0, Lx5/b;->j:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lx5/b$a;->g(Ljava/lang/String;)Lx5/b$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public J()Lx5/b$b;
    .locals 1

    iget-object v0, p0, Lx5/b;->i:Lx5/b$b;

    return-object v0
.end method

.method public K()Lx5/b$c;
    .locals 1

    iget-object v0, p0, Lx5/b;->n:Lx5/b$c;

    return-object v0
.end method

.method public L()Lx5/b$d;
    .locals 1

    iget-object v0, p0, Lx5/b;->m:Lx5/b$d;

    return-object v0
.end method

.method public M()Lx5/b$e;
    .locals 1

    iget-object v0, p0, Lx5/b;->h:Lx5/b$e;

    return-object v0
.end method

.method public N()Z
    .locals 1

    iget-boolean v0, p0, Lx5/b;->k:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lx5/b;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lx5/b;

    iget-object v0, p0, Lx5/b;->h:Lx5/b$e;

    iget-object v2, p1, Lx5/b;->h:Lx5/b$e;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/b;->i:Lx5/b$b;

    iget-object v2, p1, Lx5/b;->i:Lx5/b$b;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/b;->m:Lx5/b$d;

    iget-object v2, p1, Lx5/b;->m:Lx5/b$d;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/b;->n:Lx5/b$c;

    iget-object v2, p1, Lx5/b;->n:Lx5/b$c;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/b;->j:Ljava/lang/String;

    iget-object v2, p1, Lx5/b;->j:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lx5/b;->k:Z

    iget-boolean v2, p1, Lx5/b;->k:Z

    if-ne v0, v2, :cond_1

    iget v0, p0, Lx5/b;->l:I

    iget p1, p1, Lx5/b;->l:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lx5/b;->h:Lx5/b$e;

    const/4 v1, 0x6

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/b;->i:Lx5/b$b;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/b;->m:Lx5/b$d;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/b;->n:Lx5/b$c;

    const/4 v2, 0x3

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/b;->j:Ljava/lang/String;

    const/4 v2, 0x4

    aput-object v0, v1, v2

    iget-boolean v0, p0, Lx5/b;->k:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x5

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    invoke-virtual {p0}, Lx5/b;->M()Lx5/b$e;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lx5/b;->J()Lx5/b$b;

    move-result-object v1

    const/4 v2, 0x2

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    iget-object v1, p0, Lx5/b;->j:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/b;->N()Z

    move-result v1

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget v1, p0, Lx5/b;->l:I

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lx5/b;->L()Lx5/b$d;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-virtual {p0}, Lx5/b;->K()Lx5/b$c;

    move-result-object v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
