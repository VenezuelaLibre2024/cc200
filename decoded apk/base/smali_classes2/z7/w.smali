.class public final synthetic Lz7/w;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# static fields
.field public static final synthetic a:Lz7/w;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/w;

    invoke-direct {v0}, Lz7/w;-><init>()V

    sput-object v0, Lz7/w;->a:Lz7/w;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->d()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
