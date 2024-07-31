.class public final Lm1/b$a;
.super Lm1/b;
.source ""


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi",
        "ClassVerificationFailure"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final b:Landroid/adservices/measurement/MeasurementManager;


# direct methods
.method public constructor <init>(Landroid/adservices/measurement/MeasurementManager;)V
    .locals 1

    const-string v0, "mMeasurementManager"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lm1/b;-><init>()V

    iput-object p1, p0, Lm1/b$a;->b:Landroid/adservices/measurement/MeasurementManager;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Landroid/adservices/measurement/MeasurementManager;

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "context.getSystemService\u2026:class.java\n            )"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/adservices/measurement/MeasurementManager;

    invoke-direct {p0, p1}, Lm1/b$a;-><init>(Landroid/adservices/measurement/MeasurementManager;)V

    return-void
.end method

.method public static final synthetic g(Lm1/b$a;Lm1/a;)Landroid/adservices/measurement/DeletionRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lm1/b$a;->k(Lm1/a;)Landroid/adservices/measurement/DeletionRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic h(Lm1/b$a;Lm1/c;)Landroid/adservices/measurement/WebSourceRegistrationRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lm1/b$a;->l(Lm1/c;)Landroid/adservices/measurement/WebSourceRegistrationRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic i(Lm1/b$a;Lm1/d;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;
    .locals 0

    invoke-virtual {p0, p1}, Lm1/b$a;->m(Lm1/d;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;
    .locals 0

    iget-object p0, p0, Lm1/b$a;->b:Landroid/adservices/measurement/MeasurementManager;

    return-object p0
.end method


# virtual methods
.method public a(Lm1/a;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/a;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p2}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lm1/b$a;->j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object v1

    invoke-static {p0, p1}, Lm1/b$a;->g(Lm1/b$a;Lm1/a;)Landroid/adservices/measurement/DeletionRequest;

    move-result-object p1

    sget-object v2, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    invoke-static {v0}, Lg0/o;->a(Ljd/d;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Landroid/adservices/measurement/MeasurementManager;->deleteRegistrations(Landroid/adservices/measurement/DeletionRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public b(Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljd/d<",
            "-",
            "Ljava/lang/Integer;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p1}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lm1/b$a;->j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object v1

    sget-object v2, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    invoke-static {v0}, Lg0/o;->a(Ljd/d;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/adservices/measurement/MeasurementManager;->getMeasurementApiStatus(Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lld/h;->c(Ljd/d;)V

    :cond_0
    return-object v0
.end method

.method public c(Landroid/net/Uri;Landroid/view/InputEvent;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/view/InputEvent;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p3}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lm1/b$a;->j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object v1

    sget-object v2, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    invoke-static {v0}, Lg0/o;->a(Ljd/d;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, p1, p2, v2, v3}, Landroid/adservices/measurement/MeasurementManager;->registerSource(Landroid/net/Uri;Landroid/view/InputEvent;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    invoke-static {p3}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public d(Landroid/net/Uri;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p2}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lm1/b$a;->j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object v1

    sget-object v2, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    invoke-static {v0}, Lg0/o;->a(Ljd/d;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Landroid/adservices/measurement/MeasurementManager;->registerTrigger(Landroid/net/Uri;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public e(Lm1/c;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/c;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p2}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lm1/b$a;->j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object v1

    invoke-static {p0, p1}, Lm1/b$a;->h(Lm1/b$a;Lm1/c;)Landroid/adservices/measurement/WebSourceRegistrationRequest;

    move-result-object p1

    sget-object v2, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    invoke-static {v0}, Lg0/o;->a(Ljd/d;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Landroid/adservices/measurement/MeasurementManager;->registerWebSource(Landroid/adservices/measurement/WebSourceRegistrationRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public f(Lm1/d;Ljd/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/d;",
            "Ljd/d<",
            "-",
            "Lgd/s;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lce/p;

    invoke-static {p2}, Lkd/b;->b(Ljd/d;)Ljd/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lce/p;-><init>(Ljd/d;I)V

    invoke-virtual {v0}, Lce/p;->B()V

    invoke-static {p0}, Lm1/b$a;->j(Lm1/b$a;)Landroid/adservices/measurement/MeasurementManager;

    move-result-object v1

    invoke-static {p0, p1}, Lm1/b$a;->i(Lm1/b$a;Lm1/d;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;

    move-result-object p1

    sget-object v2, Landroidx/window/layout/c;->h:Landroidx/window/layout/c;

    invoke-static {v0}, Lg0/o;->a(Ljd/d;)Landroid/os/OutcomeReceiver;

    move-result-object v3

    invoke-virtual {v1, p1, v2, v3}, Landroid/adservices/measurement/MeasurementManager;->registerWebTrigger(Landroid/adservices/measurement/WebTriggerRegistrationRequest;Ljava/util/concurrent/Executor;Landroid/os/OutcomeReceiver;)V

    invoke-virtual {v0}, Lce/p;->y()Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    invoke-static {p2}, Lld/h;->c(Ljd/d;)V

    :cond_0
    invoke-static {}, Lkd/c;->c()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Lgd/s;->a:Lgd/s;

    return-object p1
.end method

.method public final k(Lm1/a;)Landroid/adservices/measurement/DeletionRequest;
    .locals 0

    new-instance p1, Landroid/adservices/measurement/DeletionRequest$Builder;

    invoke-direct {p1}, Landroid/adservices/measurement/DeletionRequest$Builder;-><init>()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final l(Lm1/c;)Landroid/adservices/measurement/WebSourceRegistrationRequest;
    .locals 0

    new-instance p1, Landroid/adservices/measurement/WebSourceRegistrationRequest$Builder;

    const/4 p1, 0x0

    throw p1
.end method

.method public final m(Lm1/d;)Landroid/adservices/measurement/WebTriggerRegistrationRequest;
    .locals 0

    new-instance p1, Landroid/adservices/measurement/WebTriggerRegistrationRequest$Builder;

    const/4 p1, 0x0

    throw p1
.end method
