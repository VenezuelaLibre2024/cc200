.class public final Lu3/a$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lu3/a$b;->a:I

    iput p2, p0, Lu3/a$b;->b:I

    iput-object p3, p0, Lu3/a$b;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Lu3/a$a;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lu3/a$b;-><init>(IILjava/lang/String;)V

    return-void
.end method
