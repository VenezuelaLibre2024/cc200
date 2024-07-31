.class public Lx5/e;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx5/e$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lx5/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Z

.field public final m:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lx5/s;

    invoke-direct {v0}, Lx5/s;-><init>()V

    sput-object v0, Lx5/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZI)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lx5/e;->h:Ljava/lang/String;

    iput-object p2, p0, Lx5/e;->i:Ljava/lang/String;

    iput-object p3, p0, Lx5/e;->j:Ljava/lang/String;

    iput-object p4, p0, Lx5/e;->k:Ljava/lang/String;

    iput-boolean p5, p0, Lx5/e;->l:Z

    iput p6, p0, Lx5/e;->m:I

    return-void
.end method

.method public static I()Lx5/e$a;
    .locals 1

    new-instance v0, Lx5/e$a;

    invoke-direct {v0}, Lx5/e$a;-><init>()V

    return-object v0
.end method

.method public static N(Lx5/e;)Lx5/e$a;
    .locals 2

    invoke-static {p0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lx5/e;->I()Lx5/e$a;

    move-result-object v0

    invoke-virtual {p0}, Lx5/e;->L()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/e$a;->e(Ljava/lang/String;)Lx5/e$a;

    invoke-virtual {p0}, Lx5/e;->K()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/e$a;->c(Ljava/lang/String;)Lx5/e$a;

    invoke-virtual {p0}, Lx5/e;->J()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx5/e$a;->b(Ljava/lang/String;)Lx5/e$a;

    iget-boolean v1, p0, Lx5/e;->l:Z

    invoke-virtual {v0, v1}, Lx5/e$a;->d(Z)Lx5/e$a;

    iget v1, p0, Lx5/e;->m:I

    invoke-virtual {v0, v1}, Lx5/e$a;->g(I)Lx5/e$a;

    iget-object p0, p0, Lx5/e;->j:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-virtual {v0, p0}, Lx5/e$a;->f(Ljava/lang/String;)Lx5/e$a;

    :cond_0
    return-object v0
.end method


# virtual methods
.method public J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/e;->i:Ljava/lang/String;

    return-object v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/e;->k:Ljava/lang/String;

    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx5/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public M()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-boolean v0, p0, Lx5/e;->l:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lx5/e;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lx5/e;

    iget-object v0, p0, Lx5/e;->h:Ljava/lang/String;

    iget-object v2, p1, Lx5/e;->h:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/e;->k:Ljava/lang/String;

    iget-object v2, p1, Lx5/e;->k:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lx5/e;->i:Ljava/lang/String;

    iget-object v2, p1, Lx5/e;->i:Ljava/lang/String;

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-boolean v0, p0, Lx5/e;->l:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iget-boolean v2, p1, Lx5/e;->l:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-static {v0, v2}, Lh6/q;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, Lx5/e;->m:I

    iget p1, p1, Lx5/e;->m:I

    if-ne v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lx5/e;->h:Ljava/lang/String;

    const/4 v1, 0x5

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/e;->i:Ljava/lang/String;

    const/4 v2, 0x1

    aput-object v0, v1, v2

    iget-object v0, p0, Lx5/e;->k:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v0, v1, v2

    iget-boolean v0, p0, Lx5/e;->l:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const/4 v2, 0x3

    aput-object v0, v1, v2

    iget v0, p0, Lx5/e;->m:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const/4 v2, 0x4

    aput-object v0, v1, v2

    invoke-static {v1}, Lh6/q;->c([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lx5/e;->L()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/e;->J()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lx5/e;->j:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/e;->K()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lx5/e;->M()Z

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget v0, p0, Lx5/e;->m:I

    const/4 v1, 0x6

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
