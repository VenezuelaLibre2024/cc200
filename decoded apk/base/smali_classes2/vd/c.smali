.class public abstract Lvd/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lvd/c$a;
    }
.end annotation


# static fields
.field public static final h:Lvd/c$a;

.field public static final i:Lvd/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lvd/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lvd/c$a;-><init>(Ltd/g;)V

    sput-object v0, Lvd/c;->h:Lvd/c$a;

    sget-object v0, Lnd/b;->a:Lnd/a;

    invoke-virtual {v0}, Lnd/a;->b()Lvd/c;

    move-result-object v0

    sput-object v0, Lvd/c;->i:Lvd/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Lvd/c;
    .locals 1

    sget-object v0, Lvd/c;->i:Lvd/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
