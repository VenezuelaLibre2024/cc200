.class public final Lg3/a$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lj3/f;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg3/a$g;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg3/a$g;

    invoke-direct {v0}, Lg3/a$g;-><init>()V

    sput-object v0, Lg3/a$g;->a:Lg3/a$g;

    const-string v0, "startMs"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg3/a$g;->b:Lq8/d;

    const-string v0, "endMs"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg3/a$g;->c:Lq8/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lj3/f;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg3/a$g;->b(Lj3/f;Lq8/f;)V

    return-void
.end method

.method public b(Lj3/f;Lq8/f;)V
    .locals 3

    sget-object v0, Lg3/a$g;->b:Lq8/d;

    invoke-virtual {p1}, Lj3/f;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg3/a$g;->c:Lq8/d;

    invoke-virtual {p1}, Lj3/f;->a()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    return-void
.end method
