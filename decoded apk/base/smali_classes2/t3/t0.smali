.class public final synthetic Lt3/t0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/q$a;


# instance fields
.field public final synthetic a:Lt3/b$a;

.field public final synthetic b:Lu4/n;

.field public final synthetic c:Lu4/q;

.field public final synthetic d:Ljava/io/IOException;

.field public final synthetic e:Z


# direct methods
.method public synthetic constructor <init>(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/t0;->a:Lt3/b$a;

    iput-object p2, p0, Lt3/t0;->b:Lu4/n;

    iput-object p3, p0, Lt3/t0;->c:Lu4/q;

    iput-object p4, p0, Lt3/t0;->d:Ljava/io/IOException;

    iput-boolean p5, p0, Lt3/t0;->e:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 6

    iget-object v0, p0, Lt3/t0;->a:Lt3/b$a;

    iget-object v1, p0, Lt3/t0;->b:Lu4/n;

    iget-object v2, p0, Lt3/t0;->c:Lu4/q;

    iget-object v3, p0, Lt3/t0;->d:Ljava/io/IOException;

    iget-boolean v4, p0, Lt3/t0;->e:Z

    move-object v5, p1

    check-cast v5, Lt3/b;

    invoke-static/range {v0 .. v5}, Lt3/n1;->q0(Lt3/b$a;Lu4/n;Lu4/q;Ljava/io/IOException;ZLt3/b;)V

    return-void
.end method
