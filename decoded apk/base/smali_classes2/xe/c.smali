.class public final Lxe/c;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final d:Lbf/f;

.field public static final e:Lbf/f;

.field public static final f:Lbf/f;

.field public static final g:Lbf/f;

.field public static final h:Lbf/f;

.field public static final i:Lbf/f;


# instance fields
.field public final a:Lbf/f;

.field public final b:Lbf/f;

.field public final c:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, ":"

    invoke-static {v0}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object v0

    sput-object v0, Lxe/c;->d:Lbf/f;

    const-string v0, ":status"

    invoke-static {v0}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object v0

    sput-object v0, Lxe/c;->e:Lbf/f;

    const-string v0, ":method"

    invoke-static {v0}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object v0

    sput-object v0, Lxe/c;->f:Lbf/f;

    const-string v0, ":path"

    invoke-static {v0}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object v0

    sput-object v0, Lxe/c;->g:Lbf/f;

    const-string v0, ":scheme"

    invoke-static {v0}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object v0

    sput-object v0, Lxe/c;->h:Lbf/f;

    const-string v0, ":authority"

    invoke-static {v0}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object v0

    sput-object v0, Lxe/c;->i:Lbf/f;

    return-void
.end method

.method public constructor <init>(Lbf/f;Lbf/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxe/c;->a:Lbf/f;

    iput-object p2, p0, Lxe/c;->b:Lbf/f;

    invoke-virtual {p1}, Lbf/f;->u()I

    move-result p1

    add-int/lit8 p1, p1, 0x20

    invoke-virtual {p2}, Lbf/f;->u()I

    move-result p2

    add-int/2addr p1, p2

    iput p1, p0, Lxe/c;->c:I

    return-void
.end method

.method public constructor <init>(Lbf/f;Ljava/lang/String;)V
    .locals 0

    invoke-static {p2}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lxe/c;-><init>(Lbf/f;Lbf/f;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object p1

    invoke-static {p2}, Lbf/f;->m(Ljava/lang/String;)Lbf/f;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lxe/c;-><init>(Lbf/f;Lbf/f;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lxe/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lxe/c;

    iget-object v0, p0, Lxe/c;->a:Lbf/f;

    iget-object v2, p1, Lxe/c;->a:Lbf/f;

    invoke-virtual {v0, v2}, Lbf/f;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lxe/c;->b:Lbf/f;

    iget-object p1, p1, Lxe/c;->b:Lbf/f;

    invoke-virtual {v0, p1}, Lbf/f;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lxe/c;->a:Lbf/f;

    invoke-virtual {v0}, Lbf/f;->hashCode()I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lxe/c;->b:Lbf/f;

    invoke-virtual {v0}, Lbf/f;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lxe/c;->a:Lbf/f;

    invoke-virtual {v1}, Lbf/f;->z()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lxe/c;->b:Lbf/f;

    invoke-virtual {v1}, Lbf/f;->z()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "%s: %s"

    invoke-static {v1, v0}, Lse/e;->p(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
