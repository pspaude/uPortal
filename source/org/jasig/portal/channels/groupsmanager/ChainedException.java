/**
 * Copyright � 2001 The JA-SIG Collaborative.  All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. Redistributions of any form whatsoever must retain the following
 *    acknowledgment:
 *    "This product includes software developed by the JA-SIG Collaborative
 *    (http://www.jasig.org/)."
 *
 * THIS SOFTWARE IS PROVIDED BY THE JA-SIG COLLABORATIVE "AS IS" AND ANY
 * EXPRESSED OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE JA-SIG COLLABORATIVE OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 */

package  org.jasig.portal.channels.groupsmanager;


/**
 * <p>Title: uPortal</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2002</p>
 * <p>Company: Columbia University</p>
 * @author Don Fracapane
 * @version 2.0
 */
public class ChainedException extends Exception {
   /**
    * Allows a new exception to be generated which could have a more human
    * readable message, without losing the original exception or its stack trace.
    * This class will be replaced by Exception in JDK 1.4 which will be a
    * chained exception.
    */
   private Throwable cause = null;

   /**
    * Constructor without parameters
    */
   public ChainedException () {
      super();
   }

   /**
    * Constructor for a message only
    * @param message
    */
   public ChainedException (String message) {
      super(message);
   }

   /**
    * Constructor for a message and a Throwable
    * @param message
    * @param cause
    */
   public ChainedException (String message, Throwable cause) {
      super(message);
      this.cause = cause;
   }

   /**
    * Return the underlying Throwable
    * @return Throwable
    */
   public Throwable getCause () {
      return  cause;
   }

   /**
    * Iteratively prints the stack trace for the underlying Throwable(s)
    */
   public void printStackTrace () {
      super.printStackTrace();
      if (cause != null) {
         System.err.println("Caused by:");
         cause.printStackTrace();
      }
   }

   /**
    * Iteratively prints the stack trace for the underlying Throwable(s) to a
    * PrintStream.
    * @param ps
    */
   public void printStackTrace (java.io.PrintStream ps) {
      super.printStackTrace(ps);
      if (cause != null) {
         ps.println("Caused by:");
         cause.printStackTrace(ps);
      }
   }

   /**
    * Iteratively prints the stack trace for the underlying Throwable(s) to a
    * PrintWriter.
    * @param pw
    */
   public void printStackTrace (java.io.PrintWriter pw) {
      super.printStackTrace(pw);
      if (cause != null) {
         pw.println("Caused by:");
         cause.printStackTrace(pw);
      }
   }
}
