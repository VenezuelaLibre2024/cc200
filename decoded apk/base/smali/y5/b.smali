.class public abstract Ly5/b;
.super Lf6/e;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lf6/e<",
        "Lf6/a$d$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final zza:Lf6/a$g;

.field private static final zzb:Lf6/a$a;

.field private static final zzc:Lf6/a;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lf6/a$g;

    invoke-direct {v0}, Lf6/a$g;-><init>()V

    sput-object v0, Ly5/b;->zza:Lf6/a$g;

    new-instance v1, Ly5/c;

    invoke-direct {v1}, Ly5/c;-><init>()V

    sput-object v1, Ly5/b;->zzb:Lf6/a$a;

    new-instance v2, Lf6/a;

    const-string v3, "SmsRetriever.API"

    invoke-direct {v2, v3, v1, v0}, Lf6/a;-><init>(Ljava/lang/String;Lf6/a$a;Lf6/a$g;)V

    sput-object v2, Ly5/b;->zzc:Lf6/a;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;)V
    .locals 3

    sget-object v0, Ly5/b;->zzc:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/app/Activity;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 3

    sget-object v0, Ly5/b;->zzc:Lf6/a;

    sget-object v1, Lf6/a$d;->d:Lf6/a$d$c;

    sget-object v2, Lf6/e$a;->c:Lf6/e$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lf6/e;-><init>(Landroid/content/Context;Lf6/a;Lf6/a$d;Lf6/e$a;)V

    return-void
.end method


# virtual methods
.method public abstract startSmsRetriever()Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method

.method public abstract startSmsUserConsent(Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end method
