.class public final Lo5/s$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo5/j$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:Lo5/b0;

.field public b:Lo5/m0;

.field public c:Lh7/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh7/p<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public d:Ljava/lang/String;

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo5/b0;

    invoke-direct {v0}, Lo5/b0;-><init>()V

    iput-object v0, p0, Lo5/s$b;->a:Lo5/b0;

    const/16 v0, 0x1f40

    iput v0, p0, Lo5/s$b;->e:I

    iput v0, p0, Lo5/s$b;->f:I

    return-void
.end method


# virtual methods
.method public bridge synthetic a()Lo5/j;
    .locals 1

    invoke-virtual {p0}, Lo5/s$b;->b()Lo5/s;

    move-result-object v0

    return-object v0
.end method

.method public b()Lo5/s;
    .locals 10

    new-instance v9, Lo5/s;

    iget-object v1, p0, Lo5/s$b;->d:Ljava/lang/String;

    iget v2, p0, Lo5/s$b;->e:I

    iget v3, p0, Lo5/s$b;->f:I

    iget-boolean v4, p0, Lo5/s$b;->g:Z

    iget-object v5, p0, Lo5/s$b;->a:Lo5/b0;

    iget-object v6, p0, Lo5/s$b;->c:Lh7/p;

    iget-boolean v7, p0, Lo5/s$b;->h:Z

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lo5/s;-><init>(Ljava/lang/String;IIZLo5/b0;Lh7/p;ZLo5/s$a;)V

    iget-object v0, p0, Lo5/s$b;->b:Lo5/m0;

    if-eqz v0, :cond_0

    invoke-virtual {v9, v0}, Lo5/f;->g(Lo5/m0;)V

    :cond_0
    return-object v9
.end method

.method public c(Z)Lo5/s$b;
    .locals 0

    iput-boolean p1, p0, Lo5/s$b;->g:Z

    return-object p0
.end method

.method public final d(Ljava/util/Map;)Lo5/s$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lo5/s$b;"
        }
    .end annotation

    iget-object v0, p0, Lo5/s$b;->a:Lo5/b0;

    invoke-virtual {v0, p1}, Lo5/b0;->a(Ljava/util/Map;)V

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lo5/s$b;
    .locals 0

    iput-object p1, p0, Lo5/s$b;->d:Ljava/lang/String;

    return-object p0
.end method
