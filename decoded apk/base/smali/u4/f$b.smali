.class public final Lu4/f$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final a:Lu4/t;

.field public final b:Lu4/t$c;

.field public final c:Lu4/f$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu4/f<",
            "TT;>.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu4/t;Lu4/t$c;Lu4/f$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu4/t;",
            "Lu4/t$c;",
            "Lu4/f<",
            "TT;>.a;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu4/f$b;->a:Lu4/t;

    iput-object p2, p0, Lu4/f$b;->b:Lu4/t$c;

    iput-object p3, p0, Lu4/f$b;->c:Lu4/f$a;

    return-void
.end method
