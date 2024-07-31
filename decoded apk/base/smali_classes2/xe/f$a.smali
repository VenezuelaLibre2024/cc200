.class public Lxe/f$a;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f;->L0(ILxe/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lxe/b;

.field public final synthetic k:Lxe/f;


# direct methods
.method public varargs constructor <init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;ILxe/b;)V
    .locals 0

    iput-object p1, p0, Lxe/f$a;->k:Lxe/f;

    iput p4, p0, Lxe/f$a;->i:I

    iput-object p5, p0, Lxe/f$a;->j:Lxe/b;

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 3

    :try_start_0
    iget-object v0, p0, Lxe/f$a;->k:Lxe/f;

    iget v1, p0, Lxe/f$a;->i:I

    iget-object v2, p0, Lxe/f$a;->j:Lxe/b;

    invoke-virtual {v0, v1, v2}, Lxe/f;->K0(ILxe/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lxe/f$a;->k:Lxe/f;

    invoke-static {v1, v0}, Lxe/f;->a(Lxe/f;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method
