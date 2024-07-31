.class public final Lq7/f;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lp7/a$b;

.field public b:Lb7/a;

.field public c:Lq7/e;


# direct methods
.method public constructor <init>(Lb7/a;Lp7/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq7/f;->a:Lp7/a$b;

    iput-object p1, p0, Lq7/f;->b:Lb7/a;

    new-instance p1, Lq7/e;

    invoke-direct {p1, p0}, Lq7/e;-><init>(Lq7/f;)V

    iput-object p1, p0, Lq7/f;->c:Lq7/e;

    iget-object p2, p0, Lq7/f;->b:Lb7/a;

    invoke-virtual {p2, p1}, Lb7/a;->b(Lb7/a$a;)V

    return-void
.end method

.method public static bridge synthetic a(Lq7/f;)Lp7/a$b;
    .locals 0

    iget-object p0, p0, Lq7/f;->a:Lp7/a$b;

    return-object p0
.end method
