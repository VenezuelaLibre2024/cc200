.class public Lxe/f$b;
.super Lse/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxe/f;->M0(IJ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic i:I

.field public final synthetic j:J

.field public final synthetic k:Lxe/f;


# direct methods
.method public varargs constructor <init>(Lxe/f;Ljava/lang/String;[Ljava/lang/Object;IJ)V
    .locals 0

    iput-object p1, p0, Lxe/f$b;->k:Lxe/f;

    iput p4, p0, Lxe/f$b;->i:I

    iput-wide p5, p0, Lxe/f$b;->j:J

    invoke-direct {p0, p2, p3}, Lse/b;-><init>(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public k()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Lxe/f$b;->k:Lxe/f;

    iget-object v0, v0, Lxe/f;->D:Lxe/j;

    iget v1, p0, Lxe/f$b;->i:I

    iget-wide v2, p0, Lxe/f$b;->j:J

    invoke-virtual {v0, v1, v2, v3}, Lxe/j;->W(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Lxe/f$b;->k:Lxe/f;

    invoke-static {v1, v0}, Lxe/f;->a(Lxe/f;Ljava/io/IOException;)V

    :goto_0
    return-void
.end method
