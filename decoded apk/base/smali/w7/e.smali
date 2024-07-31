.class public Lw7/e;
.super Li6/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw7/e$a;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw7/e;",
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

.field public final m:Ljava/lang/String;

.field public final n:Z

.field public o:Ljava/lang/String;

.field public p:I

.field public q:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lw7/y1;

    invoke-direct {v0}, Lw7/y1;-><init>()V

    sput-object v0, Lw7/e;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput-object p1, p0, Lw7/e;->h:Ljava/lang/String;

    iput-object p2, p0, Lw7/e;->i:Ljava/lang/String;

    iput-object p3, p0, Lw7/e;->j:Ljava/lang/String;

    iput-object p4, p0, Lw7/e;->k:Ljava/lang/String;

    iput-boolean p5, p0, Lw7/e;->l:Z

    iput-object p6, p0, Lw7/e;->m:Ljava/lang/String;

    iput-boolean p7, p0, Lw7/e;->n:Z

    iput-object p8, p0, Lw7/e;->o:Ljava/lang/String;

    iput p9, p0, Lw7/e;->p:I

    iput-object p10, p0, Lw7/e;->q:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Lw7/e$a;)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    invoke-static {p1}, Lw7/e$a;->k(Lw7/e$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lw7/e;->h:Ljava/lang/String;

    invoke-static {p1}, Lw7/e$a;->j(Lw7/e$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lw7/e;->i:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lw7/e;->j:Ljava/lang/String;

    invoke-static {p1}, Lw7/e$a;->h(Lw7/e$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lw7/e;->k:Ljava/lang/String;

    invoke-static {p1}, Lw7/e$a;->l(Lw7/e$a;)Z

    move-result v0

    iput-boolean v0, p0, Lw7/e;->l:Z

    invoke-static {p1}, Lw7/e$a;->g(Lw7/e$a;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lw7/e;->m:Ljava/lang/String;

    invoke-static {p1}, Lw7/e$a;->m(Lw7/e$a;)Z

    move-result v0

    iput-boolean v0, p0, Lw7/e;->n:Z

    invoke-static {p1}, Lw7/e$a;->i(Lw7/e$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lw7/e;->q:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lw7/e$a;Lw7/d1;)V
    .locals 0

    invoke-direct {p0, p1}, Lw7/e;-><init>(Lw7/e$a;)V

    return-void
.end method

.method public static O()Lw7/e$a;
    .locals 2

    new-instance v0, Lw7/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lw7/e$a;-><init>(Lw7/x1;)V

    return-object v0
.end method

.method public static S()Lw7/e;
    .locals 3

    new-instance v0, Lw7/e;

    new-instance v1, Lw7/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lw7/e$a;-><init>(Lw7/x1;)V

    invoke-direct {v0, v1}, Lw7/e;-><init>(Lw7/e$a;)V

    return-object v0
.end method


# virtual methods
.method public I()Z
    .locals 1

    iget-boolean v0, p0, Lw7/e;->n:Z

    return v0
.end method

.method public J()Z
    .locals 1

    iget-boolean v0, p0, Lw7/e;->l:Z

    return v0
.end method

.method public K()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->m:Ljava/lang/String;

    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->k:Ljava/lang/String;

    return-object v0
.end method

.method public M()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->i:Ljava/lang/String;

    return-object v0
.end method

.method public N()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->h:Ljava/lang/String;

    return-object v0
.end method

.method public final P()I
    .locals 1

    iget v0, p0, Lw7/e;->p:I

    return v0
.end method

.method public final Q(I)V
    .locals 0

    iput p1, p0, Lw7/e;->p:I

    return-void
.end method

.method public final R(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lw7/e;->o:Ljava/lang/String;

    return-void
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result p2

    invoke-virtual {p0}, Lw7/e;->N()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw7/e;->M()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget-object v0, p0, Lw7/e;->j:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw7/e;->L()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw7/e;->J()Z

    move-result v0

    const/4 v1, 0x5

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    invoke-virtual {p0}, Lw7/e;->K()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x6

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lw7/e;->I()Z

    move-result v0

    const/4 v1, 0x7

    invoke-static {p1, v1, v0}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v0, p0, Lw7/e;->o:Ljava/lang/String;

    const/16 v1, 0x8

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    iget v0, p0, Lw7/e;->p:I

    const/16 v1, 0x9

    invoke-static {p1, v1, v0}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-object v0, p0, Lw7/e;->q:Ljava/lang/String;

    const/16 v1, 0xa

    invoke-static {p1, v1, v0, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-static {p1, p2}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method

.method public final zzc()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->q:Ljava/lang/String;

    return-object v0
.end method

.method public final zzd()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->j:Ljava/lang/String;

    return-object v0
.end method

.method public final zze()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw7/e;->o:Ljava/lang/String;

    return-object v0
.end method
