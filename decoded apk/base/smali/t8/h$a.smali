.class public final Lt8/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lr8/b<",
        "Lt8/h$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final d:Lq8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/e<",
            "*>;>;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lq8/g<",
            "*>;>;"
        }
    .end annotation
.end field

.field public c:Lq8/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq8/e<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lt8/g;->a:Lt8/g;

    sput-object v0, Lt8/h$a;->d:Lq8/e;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt8/h$a;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lt8/h$a;->b:Ljava/util/Map;

    sget-object v0, Lt8/h$a;->d:Lq8/e;

    iput-object v0, p0, Lt8/h$a;->c:Lq8/e;

    return-void
.end method

.method public static synthetic b(Ljava/lang/Object;Lq8/f;)V
    .locals 0

    invoke-static {p0, p1}, Lt8/h$a;->e(Ljava/lang/Object;Lq8/f;)V

    return-void
.end method

.method public static synthetic e(Ljava/lang/Object;Lq8/f;)V
    .locals 2

    new-instance p1, Lq8/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lq8/c;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Class;Lq8/e;)Lr8/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lt8/h$a;->f(Ljava/lang/Class;Lq8/e;)Lt8/h$a;

    move-result-object p1

    return-object p1
.end method

.method public c()Lt8/h;
    .locals 4

    new-instance v0, Lt8/h;

    new-instance v1, Ljava/util/HashMap;

    iget-object v2, p0, Lt8/h$a;->a:Ljava/util/Map;

    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    new-instance v2, Ljava/util/HashMap;

    iget-object v3, p0, Lt8/h$a;->b:Ljava/util/Map;

    invoke-direct {v2, v3}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iget-object v3, p0, Lt8/h$a;->c:Lq8/e;

    invoke-direct {v0, v1, v2, v3}, Lt8/h;-><init>(Ljava/util/Map;Ljava/util/Map;Lq8/e;)V

    return-object v0
.end method

.method public d(Lr8/a;)Lt8/h$a;
    .locals 0

    invoke-interface {p1, p0}, Lr8/a;->a(Lr8/b;)V

    return-object p0
.end method

.method public f(Ljava/lang/Class;Lq8/e;)Lt8/h$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<U:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TU;>;",
            "Lq8/e<",
            "-TU;>;)",
            "Lt8/h$a;"
        }
    .end annotation

    iget-object v0, p0, Lt8/h$a;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lt8/h$a;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
