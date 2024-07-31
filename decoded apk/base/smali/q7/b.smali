.class public final synthetic Lq7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly7/g;


# static fields
.field public static final synthetic a:Lq7/b;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lq7/b;

    invoke-direct {v0}, Lq7/b;-><init>()V

    sput-object v0, Lq7/b;->a:Lq7/b;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ly7/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/analytics/connector/internal/AnalyticsConnectorRegistrar;->lambda$getComponents$0(Ly7/d;)Lp7/a;

    move-result-object p1

    return-object p1
.end method
