/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VComp IEEE Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType2()
 * @model
 * @generated
 */
public interface VCompIEEEType2 extends VoltageCompensatorDynamics {
    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tr</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType2_Tr()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VCompIEEEType2.tr' kind='element'"
     * @generated
     */
    Float getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Float)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Float)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Gen ICompensation For Gen J</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen ICompensation For Gen J</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen ICompensation For Gen J</em>' reference list.
     * @see #isSetGenICompensationForGenJ()
     * @see #unsetGenICompensationForGenJ()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVCompIEEEType2_GenICompensationForGenJ()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenICompensationForGenJ#getVcompIEEEType2
     * @model opposite="VcompIEEEType2" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VCompIEEEType2.GenICompensationForGenJ' kind='element'"
     * @generated
     */
    EList< GenICompensationForGenJ > getGenICompensationForGenJ();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenICompensationForGenJ()
     * @see #getGenICompensationForGenJ()
     * @generated
     */
    void unsetGenICompensationForGenJ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen ICompensation For Gen J</em>' reference list is set.
     * @see #unsetGenICompensationForGenJ()
     * @see #getGenICompensationForGenJ()
     * @generated
     */
    boolean isSetGenICompensationForGenJ();

} // VCompIEEEType2
