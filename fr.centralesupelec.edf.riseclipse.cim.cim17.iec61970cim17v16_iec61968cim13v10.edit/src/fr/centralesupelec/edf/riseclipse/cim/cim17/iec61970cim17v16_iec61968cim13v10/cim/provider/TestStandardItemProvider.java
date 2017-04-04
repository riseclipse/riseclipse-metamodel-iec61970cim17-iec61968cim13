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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TestStandard} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TestStandardItemProvider extends IdentifiedObjectItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TestStandardItemProvider( AdapterFactory adapterFactory ) {
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

            addTestMethodPropertyDescriptor( object );
            addTestVariantPropertyDescriptor( object );
            addAssetStringPropertyDescriptor( object );
            addAssetDiscretePropertyDescriptor( object );
            addAssetAnalogPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Test Method feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTestMethodPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TestStandard_testMethod_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TestStandard_testMethod_feature",
                                "_UI_TestStandard_type" ),
                        CimPackage.eINSTANCE.getTestStandard_TestMethod(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Test Variant feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addTestVariantPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TestStandard_testVariant_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TestStandard_testVariant_feature",
                                "_UI_TestStandard_type" ),
                        CimPackage.eINSTANCE.getTestStandard_TestVariant(), true, false, false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset String feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetStringPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TestStandard_AssetString_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TestStandard_AssetString_feature",
                                "_UI_TestStandard_type" ),
                        CimPackage.eINSTANCE.getTestStandard_AssetString(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset Discrete feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetDiscretePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TestStandard_AssetDiscrete_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TestStandard_AssetDiscrete_feature",
                                "_UI_TestStandard_type" ),
                        CimPackage.eINSTANCE.getTestStandard_AssetDiscrete(), true, false, true, null, null, null ) );
    }

    /**
     * This adds a property descriptor for the Asset Analog feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAssetAnalogPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(), getString( "_UI_TestStandard_AssetAnalog_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_TestStandard_AssetAnalog_feature",
                                "_UI_TestStandard_type" ),
                        CimPackage.eINSTANCE.getTestStandard_AssetAnalog(), true, false, true, null, null, null ) );
    }

    /**
     * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
     * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
     * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Collection< ? extends EStructuralFeature > getChildrenFeatures( Object object ) {
        if( childrenFeatures == null ) {
            super.getChildrenFeatures( object );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardASTM() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardCIGRE() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardDIN() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardDoble() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardEPA() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardIEC() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardIEEE() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardISO() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardLaborelec() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardTAPPI() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardUKMinistryOfDefence() );
            childrenFeatures.add( CimPackage.eINSTANCE.getTestStandard_TestStandardWEP() );
        }
        return childrenFeatures;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EStructuralFeature getChildFeature( Object object, Object child ) {
        // Check the type of the specified child object and return the proper feature to use for
        // adding (see {@link AddCommand}) it as a child.

        return super.getChildFeature( object, child );
    }

    /**
     * This returns TestStandard.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/TestStandard" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( TestStandard ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_TestStandard_type" )
                : getString( "_UI_TestStandard_type" ) + " " + label;
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

        switch( notification.getFeatureID( TestStandard.class ) ) {
        case CimPackage.TEST_STANDARD__TEST_METHOD:
        case CimPackage.TEST_STANDARD__TEST_VARIANT:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ASTM:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_CIGRE:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DIN:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_DOBLE:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_EPA:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEC:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_IEEE:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_ISO:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_LABORELEC:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_TAPPI:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_UK_MINISTRY_OF_DEFENCE:
        case CimPackage.TEST_STANDARD__TEST_STANDARD_WEP:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), true, false ) );
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

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardASTM(),
                CimFactory.eINSTANCE.createASTMStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardCIGRE(),
                CimFactory.eINSTANCE.createCIGREStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardDIN(),
                CimFactory.eINSTANCE.createDINStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardDoble(),
                CimFactory.eINSTANCE.createDobleStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardEPA(),
                CimFactory.eINSTANCE.createEPAStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardIEC(),
                CimFactory.eINSTANCE.createIECStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardIEEE(),
                CimFactory.eINSTANCE.createIEEEStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardISO(),
                CimFactory.eINSTANCE.createISOStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardLaborelec(),
                CimFactory.eINSTANCE.createLaborelecStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardTAPPI(),
                CimFactory.eINSTANCE.createTAPPIStandard() ) );

        newChildDescriptors
                .add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardUKMinistryOfDefence(),
                        CimFactory.eINSTANCE.createUKMinistryOfDefenceStandard() ) );

        newChildDescriptors.add( createChildParameter( CimPackage.eINSTANCE.getTestStandard_TestStandardWEP(),
                CimFactory.eINSTANCE.createWEPStandard() ) );
    }

}
