.class public final Lme/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# static fields
.field public static final h:Lme/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lme/a;

    invoke-direct {v0}, Lme/a;-><init>()V

    sput-object v0, Lme/a;->h:Lme/a;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method
