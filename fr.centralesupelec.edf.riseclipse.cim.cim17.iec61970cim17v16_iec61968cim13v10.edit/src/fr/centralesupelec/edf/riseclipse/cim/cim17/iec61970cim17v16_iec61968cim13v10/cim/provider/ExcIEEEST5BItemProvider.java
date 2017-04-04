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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.provider;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST5B;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcIEEEST5B} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExcIEEEST5BItemProvider extends ExcitationSystemDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcIEEEST5BItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addKcPropertyDescriptor( object );
            addKrPropertyDescriptor( object );
            addT1PropertyDescriptor( object );
            addTb1PropertyDescriptor( object );
            addTb2PropertyDescriptor( object );
            addTc1PropertyDescriptor( object );
            addTc2PropertyDescriptor( object );
            addTob1PropertyDescriptor( object );
            addTob2PropertyDescriptor( object );
            addToc1PropertyDescriptor( object );
            addToc2PropertyDescriptor( object );
            addTub1PropertyDescriptor( object );
            addTub2PropertyDescriptor( object );
            addTuc1PropertyDescriptor( object );
            addTuc2PropertyDescriptor( object );
            addVrmaxPropertyDescriptor( object );
            addVrminPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Kc feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKcPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_kc_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_kc_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Kc(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Kr feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addKrPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_kr_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_kr_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Kr(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the T1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addT1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_t1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_t1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_T1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTb1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tb1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tb1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tb1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tb2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTb2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tb2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tb2_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tb2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTc1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tc1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tc1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tc1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tc2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTc2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tc2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tc2_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tc2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tob1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTob1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tob1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tob1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tob1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tob2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTob2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tob2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tob2_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tob2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Toc1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToc1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_toc1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_toc1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Toc1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Toc2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addToc2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_toc2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_toc2_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Toc2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tub1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTub1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tub1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tub1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tub1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tub2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTub2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tub2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tub2_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tub2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tuc1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuc1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tuc1_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tuc1_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tuc1(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Tuc2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTuc2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_tuc2_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_tuc2_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Tuc2(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmax feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrmaxPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_vrmax_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_vrmax_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Vrmax(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Vrmin feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addVrminPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_ExcIEEEST5B_vrmin_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_ExcIEEEST5B_vrmin_feature",
                                "_UI_ExcIEEEST5B_type" ),
                        CimPackage.eINSTANCE.getExcIEEEST5B_Vrmin(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This returns ExcIEEEST5B.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/ExcIEEEST5B" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( ExcIEEEST5B ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_ExcIEEEST5B_type" )
                : getString( "_UI_ExcIEEEST5B_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( ExcIEEEST5B.class ) ) {
        case CimPackage.EXC_IEEEST5B__KC:
        case CimPackage.EXC_IEEEST5B__KR:
        case CimPackage.EXC_IEEEST5B__T1:
        case CimPackage.EXC_IEEEST5B__TB1:
        case CimPackage.EXC_IEEEST5B__TB2:
        case CimPackage.EXC_IEEEST5B__TC1:
        case CimPackage.EXC_IEEEST5B__TC2:
        case CimPackage.EXC_IEEEST5B__TOB1:
        case CimPackage.EXC_IEEEST5B__TOB2:
        case CimPackage.EXC_IEEEST5B__TOC1:
        case CimPackage.EXC_IEEEST5B__TOC2:
        case CimPackage.EXC_IEEEST5B__TUB1:
        case CimPackage.EXC_IEEEST5B__TUB2:
        case CimPackage.EXC_IEEEST5B__TUC1:
        case CimPackage.EXC_IEEEST5B__TUC2:
        case CimPackage.EXC_IEEEST5B__VRMAX:
        case CimPackage.EXC_IEEEST5B__VRMIN:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}
