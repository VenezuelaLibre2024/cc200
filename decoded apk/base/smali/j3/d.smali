.class public final Lj3/d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lj3/d$a;
    }
.end annotation


# static fields
.field public static final c:Lj3/d;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lj3/c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj3/d$a;

    invoke-direct {v0}, Lj3/d$a;-><init>()V

    invoke-virtual {v0}, Lj3/d$a;->a()Lj3/d;

    move-result-object v0

    sput-object v0, Lj3/d;->c:Lj3/d;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lj3/c;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj3/d;->a:Ljava/lang/String;

    iput-object p2, p0, Lj3/d;->b:Ljava/util/List;

    return-void
.end method

.method public static c()Lj3/d$a;
    .locals 1

    new-instance v0, Lj3/d$a;

    invoke-direct {v0}, Lj3/d$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lj3/c;",
            ">;"
        }
    .end annotation

    .annotation build Lt8/d;
        tag = 0x2
    .end annotation

    iget-object v0, p0, Lj3/d;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1
    .annotation build Lt8/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Lj3/d;->a:Ljava/lang/String;

    return-object v0
.end method
