.class public final synthetic Lz7/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# static fields
.field public static final synthetic a:Lz7/u;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/u;

    invoke-direct {v0}, Lz7/u;-><init>()V

    sput-object v0, Lz7/u;->a:Lz7/u;

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

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->b()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
