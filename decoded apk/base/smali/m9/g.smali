.class public final Lm9/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm9/h;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/g$a;
    }
.end annotation


# static fields
.field public static final b:Lm9/g$a;


# instance fields
.field public final a:Ly8/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly8/b<",
            "Ld3/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm9/g$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lm9/g$a;-><init>(Ltd/g;)V

    sput-object v0, Lm9/g;->b:Lm9/g$a;

    return-void
.end method

.method public constructor <init>(Ly8/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly8/b<",
            "Ld3/i;",
            ">;)V"
        }
    .end annotation

    const-string v0, "transportFactoryProvider"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/g;->a:Ly8/b;

    return-void
.end method

.method public static synthetic b(Lm9/g;Lm9/z;)[B
    .locals 0

    invoke-virtual {p0, p1}, Lm9/g;->c(Lm9/z;)[B

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lm9/z;)V
    .locals 5

    const-string v0, "sessionEvent"

    invoke-static {p1, v0}, Ltd/m;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lm9/g;->a:Ly8/b;

    invoke-interface {v0}, Ly8/b;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/i;

    const-class v1, Lm9/z;

    const-string v2, "json"

    invoke-static {v2}, Ld3/c;->b(Ljava/lang/String;)Ld3/c;

    move-result-object v2

    new-instance v3, Lm9/f;

    invoke-direct {v3, p0}, Lm9/f;-><init>(Lm9/g;)V

    const-string v4, "FIREBASE_APPQUALITY_SESSION"

    invoke-interface {v0, v4, v1, v2, v3}, Ld3/i;->a(Ljava/lang/String;Ljava/lang/Class;Ld3/c;Ld3/g;)Ld3/h;

    move-result-object v0

    invoke-static {p1}, Ld3/d;->e(Ljava/lang/Object;)Ld3/d;

    move-result-object p1

    invoke-interface {v0, p1}, Ld3/h;->a(Ld3/d;)V

    return-void
.end method

.method public final c(Lm9/z;)[B
    .locals 2

    sget-object v0, Lm9/a0;->a:Lm9/a0;

    invoke-virtual {v0}, Lm9/a0;->c()Lq8/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lq8/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Session Event: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "EventGDTLogger"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lae/c;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p1, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string v0, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, v0}, Ltd/m;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
