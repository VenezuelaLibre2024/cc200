.class public final Lw5/g;
.super Lcom/google/android/gms/internal/auth/zzbz;
.source ""


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lw5/g;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Ljava/util/HashMap;


# instance fields
.field public final h:Ljava/util/Set;

.field public final i:I

.field public j:Lw5/i;

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lw5/h;

    invoke-direct {v0}, Lw5/h;-><init>()V

    sput-object v0, Lw5/g;->CREATOR:Landroid/os/Parcelable$Creator;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lw5/g;->n:Ljava/util/HashMap;

    const-class v1, Lw5/i;

    const-string v2, "authenticatorInfo"

    const/4 v3, 0x2

    invoke-static {v2, v3, v1}, Lm6/a$a;->J(Ljava/lang/String;ILjava/lang/Class;)Lm6/a$a;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "signature"

    const/4 v2, 0x3

    invoke-static {v1, v2}, Lm6/a$a;->M(Ljava/lang/String;I)Lm6/a$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "package"

    const/4 v2, 0x4

    invoke-static {v1, v2}, Lm6/a$a;->M(Ljava/lang/String;I)Lm6/a$a;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/zzbz;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/HashSet;-><init>(I)V

    iput-object v0, p0, Lw5/g;->h:Ljava/util/Set;

    const/4 v0, 0x1

    iput v0, p0, Lw5/g;->i:I

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;ILw5/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/auth/zzbz;-><init>()V

    iput-object p1, p0, Lw5/g;->h:Ljava/util/Set;

    iput p2, p0, Lw5/g;->i:I

    iput-object p3, p0, Lw5/g;->j:Lw5/i;

    iput-object p4, p0, Lw5/g;->k:Ljava/lang/String;

    iput-object p5, p0, Lw5/g;->l:Ljava/lang/String;

    iput-object p6, p0, Lw5/g;->m:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final addConcreteTypeInternal(Lm6/a$a;Ljava/lang/String;Lm6/a;)V
    .locals 2

    invoke-virtual {p1}, Lm6/a$a;->O()I

    move-result p1

    const/4 p2, 0x2

    if-ne p1, p2, :cond_0

    check-cast p3, Lw5/i;

    iput-object p3, p0, Lw5/g;->j:Lw5/i;

    iget-object p2, p0, Lw5/g;->h:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-array p2, p2, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p2, v1

    const/4 p1, 0x1

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p3

    aput-object p3, p2, p1

    const-string p1, "Field with id=%d is not a known custom type. Found %s"

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final synthetic getFieldMappings()Ljava/util/Map;
    .locals 1

    sget-object v0, Lw5/g;->n:Ljava/util/HashMap;

    return-object v0
.end method

.method public final getFieldValue(Lm6/a$a;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p1}, Lm6/a$a;->O()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object p1, p0, Lw5/g;->l:Ljava/lang/String;

    return-object p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Lm6/a$a;->O()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown SafeParcelable id="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object p1, p0, Lw5/g;->k:Ljava/lang/String;

    return-object p1

    :cond_2
    iget-object p1, p0, Lw5/g;->j:Lw5/i;

    return-object p1

    :cond_3
    iget p1, p0, Lw5/g;->i:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1
.end method

.method public final isFieldSet(Lm6/a$a;)Z
    .locals 1

    iget-object v0, p0, Lw5/g;->h:Ljava/util/Set;

    invoke-virtual {p1}, Lm6/a$a;->O()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final setStringInternal(Lm6/a$a;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Lm6/a$a;->O()I

    move-result p1

    const/4 p2, 0x3

    if-eq p1, p2, :cond_1

    const/4 p2, 0x4

    if-ne p1, p2, :cond_0

    iput-object p3, p0, Lw5/g;->l:Ljava/lang/String;

    goto :goto_0

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    aput-object p1, p3, v0

    const-string p1, "Field with id=%d is not known to be a string."

    invoke-static {p1, p3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    iput-object p3, p0, Lw5/g;->k:Ljava/lang/String;

    :goto_0
    iget-object p2, p0, Lw5/g;->h:Ljava/util/Set;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 5

    invoke-static {p1}, Li6/c;->a(Landroid/os/Parcel;)I

    move-result v0

    iget-object v1, p0, Lw5/g;->h:Ljava/util/Set;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    iget v3, p0, Lw5/g;->i:I

    invoke-static {p1, v2, v3}, Li6/c;->u(Landroid/os/Parcel;II)V

    :cond_0
    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lw5/g;->j:Lw5/i;

    invoke-static {p1, v3, v4, p2, v2}, Li6/c;->D(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    :cond_1
    const/4 p2, 0x3

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lw5/g;->k:Ljava/lang/String;

    invoke-static {p1, p2, v3, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    :cond_2
    const/4 p2, 0x4

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lw5/g;->l:Ljava/lang/String;

    invoke-static {p1, p2, v3, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    :cond_3
    const/4 p2, 0x5

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, p0, Lw5/g;->m:Ljava/lang/String;

    invoke-static {p1, p2, v1, v2}, Li6/c;->F(Landroid/os/Parcel;ILjava/lang/String;Z)V

    :cond_4
    invoke-static {p1, v0}, Li6/c;->b(Landroid/os/Parcel;I)V

    return-void
.end method
