.class public Lv0/p;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lv0/p$a;
    }
.end annotation


# static fields
.field public static b:Z = true

.field public static final c:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static volatile d:Lv0/p;

.field public static final e:Lv0/p;


# instance fields
.field public final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lv0/p$a;",
            "Lv0/y$e<",
            "**>;>;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    invoke-static {}, Lv0/p;->c()Ljava/lang/Class;

    move-result-object v0

    sput-object v0, Lv0/p;->c:Ljava/lang/Class;

    new-instance v0, Lv0/p;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lv0/p;-><init>(Z)V

    sput-object v0, Lv0/p;->e:Lv0/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lv0/p;->a:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lv0/p;->a:Ljava/util/Map;

    return-void
.end method

.method public static b()Lv0/p;
    .locals 2

    sget-object v0, Lv0/p;->d:Lv0/p;

    if-nez v0, :cond_2

    const-class v1, Lv0/p;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lv0/p;->d:Lv0/p;

    if-nez v0, :cond_1

    sget-boolean v0, Lv0/p;->b:Z

    if-eqz v0, :cond_0

    invoke-static {}, Lv0/o;->a()Lv0/p;

    move-result-object v0

    goto :goto_0

    :cond_0
    sget-object v0, Lv0/p;->e:Lv0/p;

    :goto_0
    sput-object v0, Lv0/p;->d:Lv0/p;

    :cond_1
    monitor-exit v1

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_2
    :goto_1
    return-object v0
.end method

.method public static c()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    :try_start_0
    const-string v0, "androidx.datastore.preferences.protobuf.Extension"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public a(Lv0/r0;I)Lv0/y$e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ContainingType::",
            "Lv0/r0;",
            ">(TContainingType;I)",
            "Lv0/y$e<",
            "TContainingType;*>;"
        }
    .end annotation

    iget-object v0, p0, Lv0/p;->a:Ljava/util/Map;

    new-instance v1, Lv0/p$a;

    invoke-direct {v1, p1, p2}, Lv0/p$a;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lv0/y$e;

    return-object p1
.end method
