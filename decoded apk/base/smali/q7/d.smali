.class public final Lq7/d;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public b:Lp7/a$b;

.field public c:Lb7/a;

.field public d:Lq7/c;


# direct methods
.method public constructor <init>(Lb7/a;Lp7/a$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq7/d;->b:Lp7/a$b;

    iput-object p1, p0, Lq7/d;->c:Lb7/a;

    new-instance p1, Lq7/c;

    invoke-direct {p1, p0}, Lq7/c;-><init>(Lq7/d;)V

    iput-object p1, p0, Lq7/d;->d:Lq7/c;

    iget-object p2, p0, Lq7/d;->c:Lb7/a;

    invoke-virtual {p2, p1}, Lb7/a;->b(Lb7/a$a;)V

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lq7/d;->a:Ljava/util/Set;

    return-void
.end method

.method public static bridge synthetic a(Lq7/d;)Lp7/a$b;
    .locals 0

    iget-object p0, p0, Lq7/d;->b:Lp7/a$b;

    return-object p0
.end method
