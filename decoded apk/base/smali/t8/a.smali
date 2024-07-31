.class public final Lt8/a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt8/a$a;
    }
.end annotation


# instance fields
.field public a:I

.field public b:Lt8/d$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lt8/d$a;->h:Lt8/d$a;

    iput-object v0, p0, Lt8/a;->b:Lt8/d$a;

    return-void
.end method

.method public static b()Lt8/a;
    .locals 1

    new-instance v0, Lt8/a;

    invoke-direct {v0}, Lt8/a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Lt8/d;
    .locals 3

    new-instance v0, Lt8/a$a;

    iget v1, p0, Lt8/a;->a:I

    iget-object v2, p0, Lt8/a;->b:Lt8/d$a;

    invoke-direct {v0, v1, v2}, Lt8/a$a;-><init>(ILt8/d$a;)V

    return-object v0
.end method

.method public c(I)Lt8/a;
    .locals 0

    iput p1, p0, Lt8/a;->a:I

    return-object p0
.end method
