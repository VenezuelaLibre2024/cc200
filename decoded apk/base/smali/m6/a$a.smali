.class public Lm6/a$a;
.super Li6/a;
.source ""


# annotations
.annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
        "Ljava/lang/Object;",
        ">",
        "Li6/a;"
    }
.end annotation


# static fields
.field public static final CREATOR:Lm6/d;


# instance fields
.field public final h:I

.field public final i:I

.field public final j:Z

.field public final k:I

.field public final l:Z

.field public final m:Ljava/lang/String;

.field public final n:I

.field public final o:Ljava/lang/Class;

.field public final p:Ljava/lang/String;

.field public q:Lm6/h;

.field public r:Lm6/a$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lm6/d;

    invoke-direct {v0}, Lm6/d;-><init>()V

    sput-object v0, Lm6/a$a;->CREATOR:Lm6/d;

    return-void
.end method

.method public constructor <init>(IIZIZLjava/lang/String;ILjava/lang/String;Ll6/b;)V
    .locals 0

    invoke-direct {p0}, Li6/a;-><init>()V

    iput p1, p0, Lm6/a$a;->h:I

    iput p2, p0, Lm6/a$a;->i:I

    iput-boolean p3, p0, Lm6/a$a;->j:Z

    iput p4, p0, Lm6/a$a;->k:I

    iput-boolean p5, p0, Lm6/a$a;->l:Z

    iput-object p6, p0, Lm6/a$a;->m:Ljava/lang/String;

    iput p7, p0, Lm6/a$a;->n:I

    const/4 p1, 0x0

    if-nez p8, :cond_0

    iput-object p1, p0, Lm6/a$a;->o:Ljava/lang/Class;

    iput-object p1, p0, Lm6/a$a;->p:Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-class p2, Lm6/c;

    iput-object p2, p0, Lm6/a$a;->o:Ljava/lang/Class;

    iput-object p8, p0, Lm6/a$a;->p:Ljava/lang/String;

    :goto_0
    if-nez p9, :cond_1

    iput-object p1, p0, Lm6/a$a;->r:Lm6/a$b;

    return-void

    :cond_1
    invoke-virtual {p9}, Ll6/b;->J()Lm6/a$b;

    move-result-object p1

    iput-object p1, p0, Lm6/a$a;->r:Lm6/a$b;

    return-void
.end method

.method public constructor <init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V
    .locals 1

    invoke-direct {p0}, Li6/a;-><init>()V

    const/4 v0, 0x1

    iput v0, p0, Lm6/a$a;->h:I

    iput p1, p0, Lm6/a$a;->i:I

    iput-boolean p2, p0, Lm6/a$a;->j:Z

    iput p3, p0, Lm6/a$a;->k:I

    iput-boolean p4, p0, Lm6/a$a;->l:Z

    iput-object p5, p0, Lm6/a$a;->m:Ljava/lang/String;

    iput p6, p0, Lm6/a$a;->n:I

    iput-object p7, p0, Lm6/a$a;->o:Ljava/lang/Class;

    if-nez p7, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p7}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lm6/a$a;->p:Ljava/lang/String;

    iput-object p8, p0, Lm6/a$a;->r:Lm6/a$b;

    return-void
.end method

.method public static I(Ljava/lang/String;I)Lm6/a$a;
    .locals 10
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lm6/a$a<",
            "[B[B>;"
        }
    .end annotation

    new-instance v9, Lm6/a$a;

    const/16 v1, 0x8

    const/4 v2, 0x0

    const/16 v3, 0x8

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p0

    move v6, p1

    invoke-direct/range {v0 .. v8}, Lm6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V

    return-object v9
.end method

.method public static J(Ljava/lang/String;ILjava/lang/Class;)Lm6/a$a;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm6/a;",
            ">(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lm6/a$a<",
            "TT;TT;>;"
        }
    .end annotation

    new-instance v9, Lm6/a$a;

    const/16 v1, 0xb

    const/4 v2, 0x0

    const/16 v3, 0xb

    const/4 v4, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lm6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V

    return-object v9
.end method

.method public static K(Ljava/lang/String;ILjava/lang/Class;)Lm6/a$a;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm6/a;",
            ">(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lm6/a$a<",
            "Ljava/util/ArrayList<",
            "TT;>;",
            "Ljava/util/ArrayList<",
            "TT;>;>;"
        }
    .end annotation

    new-instance v9, Lm6/a$a;

    const/16 v1, 0xb

    const/4 v2, 0x1

    const/16 v3, 0xb

    const/4 v4, 0x1

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p0

    move v6, p1

    move-object v7, p2

    invoke-direct/range {v0 .. v8}, Lm6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V

    return-object v9
.end method

.method public static L(Ljava/lang/String;I)Lm6/a$a;
    .locals 10
    .annotation build Lcom/google/android/gms/common/util/VisibleForTesting;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lm6/a$a<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    new-instance v9, Lm6/a$a;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p0

    move v6, p1

    invoke-direct/range {v0 .. v8}, Lm6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V

    return-object v9
.end method

.method public static M(Ljava/lang/String;I)Lm6/a$a;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lm6/a$a<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v9, Lm6/a$a;

    const/4 v1, 0x7

    const/4 v2, 0x0

    const/4 v3, 0x7

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p0

    move v6, p1

    invoke-direct/range {v0 .. v8}, Lm6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V

    return-object v9
.end method

.method public static N(Ljava/lang/String;I)Lm6/a$a;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)",
            "Lm6/a$a<",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    new-instance v9, Lm6/a$a;

    const/4 v1, 0x7

    const/4 v2, 0x1

    const/4 v3, 0x7

    const/4 v4, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, v9

    move-object v5, p0

    move v6, p1

    invoke-direct/range {v0 .. v8}, Lm6/a$a;-><init>(IZIZLjava/lang/String;ILjava/lang/Class;Lm6/a$b;)V

    return-object v9
.end method

.method public static bridge synthetic Q(Lm6/a$a;)Lm6/a$b;
    .locals 0

    iget-object p0, p0, Lm6/a$a;->r:Lm6/a$b;

    return-object p0
.end method


# virtual methods
.method public O()I
    .locals 1

    iget v0, p0, Lm6/a$a;->n:I

    return v0
.end method

.method public final P()Ll6/b;
    .locals 1

    iget-object v0, p0, Lm6/a$a;->r:Lm6/a$b;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v0}, Ll6/b;->I(Lm6/a$b;)Ll6/b;

    move-result-object v0

    return-object v0
.end method

.method public final R(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm6/a$a;->r:Lm6/a$b;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lm6/a$a;->r:Lm6/a$b;

    invoke-interface {v0, p1}, Lm6/a$b;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final S(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lm6/a$a;->r:Lm6/a$b;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lm6/a$a;->r:Lm6/a$b;

    invoke-interface {v0, p1}, Lm6/a$b;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final T()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lm6/a$a;->p:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :cond_0
    return-object v0
.end method

.method public final U()Ljava/util/Map;
    .locals 2

    iget-object v0, p0, Lm6/a$a;->p:Ljava/lang/String;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lm6/a$a;->q:Lm6/h;

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lm6/a$a;->q:Lm6/h;

    iget-object v1, p0, Lm6/a$a;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lm6/h;->J(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lh6/s;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0
.end method

.method public final V(Lm6/h;)V
    .locals 0

    iput-object p1, p0, Lm6/a$a;->q:Lm6/h;

    return-void
.end method

.method public final W()Z
    .locals 1

    iget-object v0, p0, Lm6/a$a;->r:Lm6/a$b;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lh6/q;->d(Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget v1, p0, Lm6/a$a;->h:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "versionCode"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget v1, p0, Lm6/a$a;->i:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "typeIn"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-boolean v1, p0, Lm6/a$a;->j:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "typeInArray"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget v1, p0, Lm6/a$a;->k:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "typeOut"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-boolean v1, p0, Lm6/a$a;->l:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "typeOutArray"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lm6/a$a;->m:Ljava/lang/String;

    const-string v2, "outputFieldName"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget v1, p0, Lm6/a$a;->n:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "safeParcelFieldId"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    invoke-virtual {p0}, Lm6/a$a;->T()Ljava/lang/String;

    move-result-object v1

    const-string v2, "concreteTypeName"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    move-result-object v0

    iget-object v1, p0, Lm6/a$a;->o:Ljava/lang/Class;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "concreteType.class"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    :cond_0
    iget-object v1, p0, Lm6/a$a;->r:Lm6/a$b;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "converterName"

    invoke-virtual {v0, v2, v1}, Lh6/q$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lh6/q$a;

    :cond_1
    invoke-virtual {v0}, Lh6/q$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget v1, p0, Lm6/a$a;->h:I

    const/4 v2, 0x1

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget v1, p0, Lm6/a$a;->i:I

    const/4 v2, 0x2

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-boolean v1, p0, Lm6/a$a;->j:Z

    const/4 v2, 0x3

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget v1, p0, Lm6/a$a;->k:I

    const/4 v2, 0x4

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    iget-boolean v1, p0, Lm6/a$a;->l:Z

    const/4 v2, 0x5

    invoke-static {p1, v2, v1}, Li6/c;->g(Landroid/os/Parcel;IZ)V

    iget-object v1, p0, Lm6/a$a;->m:Ljava/lang/String;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lm6/a$a;->O()I

    move-result v1

    const/4 v2, 0x7

    invoke-static {p1, v2, v1}, Li6/c;->u(Landroid/os/Parcel;II)V

    invoke-virtual {p0}, Lm6/a$a;->T()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8

    invoke-static {p1, v2, v1, v3}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    invoke-virtual {p0}, Lm6/a$a;->P()Ll6/b;

    move-result-object v1

    const/16 v2, 0x9

    invoke-static {p1, v2, v1, p2, v3}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
