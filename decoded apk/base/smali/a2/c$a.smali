.class public La2/c$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# static fields
.field public static final a:La2/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb2/m;

    invoke-direct {v0}, Lb2/m;-><init>()V

    sput-object v0, La2/c$a;->a:La2/c;

    return-void
.end method
