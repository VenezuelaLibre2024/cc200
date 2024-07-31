.class public interface abstract Lf6/a$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/a$d$c;,
        Lf6/a$d$b;,
        Lf6/a$d$a;
    }
.end annotation


# static fields
.field public static final d:Lf6/a$d$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lf6/a$d$c;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lf6/a$d$c;-><init>(Lf6/s;)V

    sput-object v0, Lf6/a$d;->d:Lf6/a$d$c;

    return-void
.end method
