.class public Lhb/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lhb/j;


# instance fields
.field public a:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lia/a;",
            ">;"
        }
    .end annotation
.end field

.field public b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;Ljava/util/Map;Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lia/a;",
            ">;",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb/m;->a:Ljava/util/Collection;

    iput-object p2, p0, Lhb/m;->b:Ljava/util/Map;

    iput-object p3, p0, Lhb/m;->c:Ljava/lang/String;

    iput p4, p0, Lhb/m;->d:I

    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)Lhb/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lia/e;",
            "*>;)",
            "Lhb/i;"
        }
    .end annotation

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lia/e;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    iget-object p1, p0, Lhb/m;->b:Ljava/util/Map;

    if-eqz p1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    :cond_0
    iget-object p1, p0, Lhb/m;->a:Ljava/util/Collection;

    if-eqz p1, :cond_1

    sget-object v1, Lia/e;->k:Lia/e;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object p1, p0, Lhb/m;->c:Ljava/lang/String;

    if-eqz p1, :cond_2

    sget-object v1, Lia/e;->m:Lia/e;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    new-instance p1, Lia/i;

    invoke-direct {p1}, Lia/i;-><init>()V

    invoke-virtual {p1, v0}, Lia/i;->e(Ljava/util/Map;)V

    iget v0, p0, Lhb/m;->d:I

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    if-eq v0, v1, :cond_4

    const/4 v1, 0x2

    if-eq v0, v1, :cond_3

    new-instance v0, Lhb/i;

    invoke-direct {v0, p1}, Lhb/i;-><init>(Lia/l;)V

    return-object v0

    :cond_3
    new-instance v0, Lhb/o;

    invoke-direct {v0, p1}, Lhb/o;-><init>(Lia/l;)V

    return-object v0

    :cond_4
    new-instance v0, Lhb/n;

    invoke-direct {v0, p1}, Lhb/n;-><init>(Lia/l;)V

    return-object v0

    :cond_5
    new-instance v0, Lhb/i;

    invoke-direct {v0, p1}, Lhb/i;-><init>(Lia/l;)V

    return-object v0
.end method
