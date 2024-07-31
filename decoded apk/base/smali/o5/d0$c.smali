.class public final Lo5/d0$c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo5/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public final a:Lu4/n;

.field public final b:Lu4/q;

.field public final c:Ljava/io/IOException;

.field public final d:I


# direct methods
.method public constructor <init>(Lu4/n;Lu4/q;Ljava/io/IOException;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo5/d0$c;->a:Lu4/n;

    iput-object p2, p0, Lo5/d0$c;->b:Lu4/q;

    iput-object p3, p0, Lo5/d0$c;->c:Ljava/io/IOException;

    iput p4, p0, Lo5/d0$c;->d:I

    return-void
.end method
