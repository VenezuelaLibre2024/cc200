.class public final Lg9/a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq8/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lq8/e<",
        "Lh9/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lg9/a$a;

.field public static final b:Lq8/d;

.field public static final c:Lq8/d;

.field public static final d:Lq8/d;

.field public static final e:Lq8/d;

.field public static final f:Lq8/d;

.field public static final g:Lq8/d;

.field public static final h:Lq8/d;

.field public static final i:Lq8/d;

.field public static final j:Lq8/d;

.field public static final k:Lq8/d;

.field public static final l:Lq8/d;

.field public static final m:Lq8/d;

.field public static final n:Lq8/d;

.field public static final o:Lq8/d;

.field public static final p:Lq8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lg9/a$a;

    invoke-direct {v0}, Lg9/a$a;-><init>()V

    sput-object v0, Lg9/a$a;->a:Lg9/a$a;

    const-string v0, "projectNumber"

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

    sput-object v0, Lg9/a$a;->b:Lq8/d;

    const-string v0, "messageId"

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

    sput-object v0, Lg9/a$a;->c:Lq8/d;

    const-string v0, "instanceId"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x3

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->d:Lq8/d;

    const-string v0, "messageType"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x4

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->e:Lq8/d;

    const-string v0, "sdkPlatform"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x5

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->f:Lq8/d;

    const-string v0, "packageName"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x6

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->g:Lq8/d;

    const-string v0, "collapseKey"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/4 v2, 0x7

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->h:Lq8/d;

    const-string v0, "priority"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->i:Lq8/d;

    const-string v0, "ttl"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0x9

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->j:Lq8/d;

    const-string v0, "topic"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0xa

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->k:Lq8/d;

    const-string v0, "bulkId"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0xb

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->l:Lq8/d;

    const-string v0, "event"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0xc

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->m:Lq8/d;

    const-string v0, "analyticsLabel"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0xd

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->n:Lq8/d;

    const-string v0, "campaignId"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0xe

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->o:Lq8/d;

    const-string v0, "composerLabel"

    invoke-static {v0}, Lq8/d;->a(Ljava/lang/String;)Lq8/d$b;

    move-result-object v0

    invoke-static {}, Lt8/a;->b()Lt8/a;

    move-result-object v1

    const/16 v2, 0xf

    invoke-virtual {v1, v2}, Lt8/a;->c(I)Lt8/a;

    move-result-object v1

    invoke-virtual {v1}, Lt8/a;->a()Lt8/d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq8/d$b;->b(Ljava/lang/annotation/Annotation;)Lq8/d$b;

    move-result-object v0

    invoke-virtual {v0}, Lq8/d$b;->a()Lq8/d;

    move-result-object v0

    sput-object v0, Lg9/a$a;->p:Lq8/d;

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

    check-cast p1, Lh9/a;

    check-cast p2, Lq8/f;

    invoke-virtual {p0, p1, p2}, Lg9/a$a;->b(Lh9/a;Lq8/f;)V

    return-void
.end method

.method public b(Lh9/a;Lq8/f;)V
    .locals 3

    sget-object v0, Lg9/a$a;->b:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->l()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg9/a$a;->c:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->d:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->g()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->e:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->i()Lh9/a$c;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->f:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->m()Lh9/a$d;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->g:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->j()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->h:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->i:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->k()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg9/a$a;->j:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->o()I

    move-result v1

    invoke-interface {p2, v0, v1}, Lq8/f;->a(Lq8/d;I)Lq8/f;

    sget-object v0, Lg9/a$a;->k:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->n()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->l:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->b()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg9/a$a;->m:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->f()Lh9/a$b;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->n:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p2, v0, v1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    sget-object v0, Lg9/a$a;->o:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->c()J

    move-result-wide v1

    invoke-interface {p2, v0, v1, v2}, Lq8/f;->b(Lq8/d;J)Lq8/f;

    sget-object v0, Lg9/a$a;->p:Lq8/d;

    invoke-virtual {p1}, Lh9/a;->e()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, v0, p1}, Lq8/f;->e(Lq8/d;Ljava/lang/Object;)Lq8/f;

    return-void
.end method
