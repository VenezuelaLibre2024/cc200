.class public final Lj3/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/a$a;
    }
.end annotation


# static fields
.field public static final e:Lj3/a;


# instance fields
.field public final a:Lj3/f;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj3/d;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lj3/b;

.field public final d:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/a$a;

    invoke-direct {v0}, Lj3/a$a;-><init>()V

    invoke-virtual {v0}, Lj3/a$a;->b()Lj3/a;

    move-result-object v0

    sput-object v0, Lj3/a;->e:Lj3/a;

    return-void
.end method

.method public constructor <init>(Lj3/f;Ljava/util/List;Lj3/b;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj3/f;",
            "Ljava/util/List<",
            "Lj3/d;",
            ">;",
            "Lj3/b;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/a;->a:Lj3/f;

    iput-object p2, p0, Lj3/a;->b:Ljava/util/List;

    iput-object p3, p0, Lj3/a;->c:Lj3/b;

    iput-object p4, p0, Lj3/a;->d:Ljava/lang/String;

    return-void
.end method

.method public static e()Lj3/a$a;
    .locals 1

    new-instance v0, Lj3/a$a;

    invoke-direct {v0}, Lj3/a$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x4
    .end annotation

    iget-object v0, p0, Lj3/a;->d:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lj3/b;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x3
    .end annotation

    iget-object v0, p0, Lj3/a;->c:Lj3/b;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj3/d;",
            ">;"
        }
    .end annotation

    .annotation build Lt8/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Lj3/a;->b:Ljava/util/List;

    return-object v0
.end method

.method public d()Lj3/f;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lj3/a;->a:Lj3/f;

    return-object v0
.end method

.method public f()[B
    .locals 1

    invoke-static {p0}, Lg3/m;->a(Ljava/lang/Object;)[B

    move-result-object v0

    return-object v0
.end method
