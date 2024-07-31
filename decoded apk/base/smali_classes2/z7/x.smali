.class public final synthetic Lz7/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly8/b;


# static fields
.field public static final synthetic a:Lz7/x;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lz7/x;

    invoke-direct {v0}, Lz7/x;-><init>()V

    sput-object v0, Lz7/x;->a:Lz7/x;

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

    invoke-static {}, Lcom/google/firebase/concurrent/ExecutorsRegistrar;->g()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v0

    return-object v0
.end method
