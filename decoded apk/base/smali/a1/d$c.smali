.class public final La1/d$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La1/d$c$a;
    }
.end annotation


# static fields
.field public static final d:La1/d$c$a;

.field public static final e:La1/d$c;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "La1/d$a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:La1/d$b;

.field public final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "La1/n;",
            ">;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, La1/d$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La1/d$c$a;-><init>(Ltd/g;)V

    sput-object v0, La1/d$c;->d:La1/d$c$a;

    new-instance v0, La1/d$c;

    invoke-static {}, Lhd/h0;->b()Ljava/util/Set;

    move-result-object v2

    invoke-static {}, Lhd/e0;->d()Ljava/util/Map;

    move-result-object v3

    invoke-direct {v0, v2, v1, v3}, La1/d$c;-><init>(Ljava/util/Set;La1/d$b;Ljava/util/Map;)V

    sput-object v0, La1/d$c;->e:La1/d$c;

    return-void
.end method

.method public constructor <init>(Ljava/util/Set;La1/d$b;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "+",
            "La1/d$a;",
            ">;",
            "La1/d$b;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "La1/n;",
            ">;>;>;)V"
        }
    .end annotation

    const-string v0, "flags"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allowedViolations"

    invoke-static {p3, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La1/d$c;->a:Ljava/util/Set;

    iput-object p2, p0, La1/d$c;->b:La1/d$b;

    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {p3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Set;

    invoke-interface {p1, v0, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iput-object p1, p0, La1/d$c;->c:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "La1/d$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La1/d$c;->a:Ljava/util/Set;

    return-object v0
.end method

.method public final b()La1/d$b;
    .locals 1

    iget-object v0, p0, La1/d$c;->b:La1/d$b;

    return-object v0
.end method

.method public final c()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "+",
            "La1/n;",
            ">;>;>;"
        }
    .end annotation

    iget-object v0, p0, La1/d$c;->c:Ljava/util/Map;

    return-object v0
.end method
