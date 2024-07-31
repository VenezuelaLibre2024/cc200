.class public final Ln2/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field public final h:Ln2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln2/a<",
            "TV;>;"
        }
    .end annotation
.end field

.field public final i:Ll7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll7/f<",
            "+TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln2/a;Ll7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln2/a<",
            "TV;>;",
            "Ll7/f<",
            "+TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln2/a$g;->h:Ln2/a;

    iput-object p2, p0, Ln2/a$g;->i:Ll7/f;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Ln2/a$g;->h:Ln2/a;

    iget-object v0, v0, Ln2/a;->h:Ljava/lang/Object;

    if-eq v0, p0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln2/a$g;->i:Ll7/f;

    invoke-static {v0}, Ln2/a;->j(Ll7/f;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ln2/a;->m:Ln2/a$b;

    iget-object v2, p0, Ln2/a$g;->h:Ln2/a;

    invoke-virtual {v1, v2, p0, v0}, Ln2/a$b;->b(Ln2/a;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ln2/a$g;->h:Ln2/a;

    invoke-static {v0}, Ln2/a;->g(Ln2/a;)V

    :cond_1
    return-void
.end method
